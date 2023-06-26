/**
 * Merge Sorted Array
 *         You are given two integer arrays nums1 and nums2,
 *         sorted in non-decreasing order, and two integers m and n,
 *         representing the number of elements in nums1 and nums2 respectively.
 *         Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *         The final sorted array should not be returned by the function,
 *         but instead be stored inside the array nums1.
 *         To accommodate this, nums1 has a length of m + n,
 *         where the first m elements denote the elements that should be merged,
 *         and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

/**
 * Approach to solve this
 * Traverse nums2 array from the end traverse nums2 array as it is given that nums1 array will always be greater than equal to nums2 array and we will traverse nums2 array from end as the array and we will traverse nums2 array from end as the
 * array is sorted ans we need largest eleent to solve the problem
 * compare the largest element of the nums2 array with the largest of the nums1 array m-1 index
 * the largest element after comparing both the arrays will be stores at the end of nums1 array at nums1.length-1 index
 *
 *
 */
/**
 * How to solve this
 * 1. Declare 3 variables i,j,k which will act as pointers
 * variable i will point at m-1(index),which holds the largest element of the nums1 array
 * variable j will point at n-1(index) thats the last position of the nums2 array
 * which holds the largest element of the nums 2 array.
 * while k will point to the last position of the nums1 array and will insert the largest element after comparing both arrays
 *
 * 2.We will traverse the nums2 array and will check the 2 conditions :
 * 1 : If index i is greater than 0 and also the element at i index of nums1 array is greater than the element at j index of nums2 array.
 * If this condition is true, it means element at i index of nums1 array is largest among both the arrays and will be stored at last index/position of the nums1 array.
 * After this we will decrease the value of i as we have to compare the other element of nums1 array with element of nums2 array.
 * We will also decrease the value of k as the last position is filled and now new position is needed.
 * 2 : If condition 1 fails, it means that either the element at j index of nums2 array is greater than the element at i index of nums1 array or there is no element left to compare with the nums1 array and we just have to push the elements of nums2 array in the nums1 array (They are the remaining smallest elements).
 * We will decrease the value of j for other comparisons and also the value of k to store other elements.
 */


class Solution{
    public static void merge(int[] nums1,int m, int[] nums2, int n){
        int i =m-1;
        int j =n-1;
        int k =nums1.length-1;

        while(j>=0){
            if (i>=0 && nums1[i] > nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else {
                nums1[k] =nums2[j];
                k--;
                j--;
            }
        }
    }
}