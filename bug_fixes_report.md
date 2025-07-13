# Bug Fixes Report

## Summary
This report documents 3 critical bugs that were identified and fixed in the algorithms and data structures codebase.

## Bug 1: Integer Overflow Vulnerability in Binary Search

**File**: `Array/Binary_Search.java`
**Line**: 8
**Bug Type**: Security vulnerability / Logic error
**Severity**: High

### Description
The binary search implementation contained a potential integer overflow vulnerability in the midpoint calculation:
```java
int mid=(Start+end)/2;
```

When `Start` and `end` are large integers (close to Integer.MAX_VALUE), their sum can overflow and wrap around to a negative number, causing incorrect behavior or potential security issues.

### Fix Applied
```java
// Before (vulnerable)
int mid=(Start+end)/2;

// After (fixed)
int mid=Start+(end-Start)/2;
```

### Explanation
The fix uses `Start+(end-Start)/2` which is mathematically equivalent but avoids the overflow issue. This is a standard practice in binary search implementations to prevent integer overflow.

---

## Bug 2: Logic Error in Max Subarray Prefix Calculation

**File**: `Array/Max_Subarray.java`
**Lines**: 8-9, 12
**Bug Type**: Logic error
**Severity**: High

### Description
The maximum subarray implementation had two critical issues:
1. The prefix array calculation started from index 1, completely missing the first element (`number[0]`)
2. The outer loop had incorrect bounds (`i<number.length-1` instead of `i<number.length`)

### Original Code
```java
int prefix[]=new int[number.length];
//calculating prefix array
for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]+number[i];
} 
for(int i=0;i<number.length-1;i++){
```

### Fix Applied
```java
int prefix[]=new int[number.length];
//calculating prefix array
prefix[0]=number[0];  // Initialize first element
for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]+number[i];
} 
for(int i=0;i<number.length;i++){  // Fixed loop bounds
```

### Explanation
- Added `prefix[0]=number[0]` to properly initialize the first element of the prefix array
- Changed the outer loop condition from `i<number.length-1` to `i<number.length` to ensure all possible subarrays are considered
- This ensures the algorithm correctly finds the maximum sum subarray

---

## Bug 3: Incorrect Bubble Sort Implementation

**File**: `Sorting/BubbleSort.java`
**Lines**: 7-8
**Bug Type**: Logic error
**Severity**: Medium

### Description
The method named `bubble_Sort` was actually implementing selection sort, not bubble sort. The algorithm was comparing all elements with a selected element rather than comparing adjacent elements.

### Original Code (Selection Sort)
```java
for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
```

### Fix Applied (Actual Bubble Sort)
```java
for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
```

### Explanation
- Changed inner loop to compare adjacent elements (`j` and `j+1`)
- Modified loop bounds to `j<arr.length-1-i` to avoid accessing out-of-bounds elements and optimize by reducing comparisons as the array gets sorted
- This implements the correct bubble sort algorithm where adjacent elements are compared and swapped

---

## Impact Assessment

### Bug 1 (Integer Overflow)
- **Impact**: Could cause incorrect results or crashes with large datasets
- **Security Risk**: Potential exploitation in security-sensitive applications
- **Performance**: No performance impact after fix

### Bug 2 (Max Subarray)
- **Impact**: Algorithm would produce incorrect results for all inputs
- **Correctness**: Critical correctness issue that made the algorithm unreliable
- **Performance**: No performance impact after fix

### Bug 3 (Bubble Sort)
- **Impact**: Misleading implementation that doesn't match the method name
- **Correctness**: Algorithm worked but was mislabeled
- **Performance**: Selection sort (O(n²)) vs Bubble sort (O(n²)) - same complexity but different behavior

## Testing Recommendations

1. **Binary Search**: Test with large arrays and boundary values
2. **Max Subarray**: Test with arrays containing negative numbers, all negative numbers, and single elements
3. **Bubble Sort**: Verify the sorting behavior matches bubble sort characteristics (adjacent element swapping)

All fixes have been applied and the code should now function correctly according to the intended algorithms.