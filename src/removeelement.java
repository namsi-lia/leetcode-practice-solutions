/**
 * Remove Element
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k,
 * to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain
 * the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

import java.util.Arrays;

/***
 * Approach to solve this solution
 * initialize two variables i and j as pointers
 * to point to the beginning of the nums and nums2 arrays respectively
 * 2. create a loop that iterates until variable i reaches the end of nums in each iteration it compares the element at nums[i] to val
 * if the element at nums[i] is not equal to val the element at nums[i] to nums[j] and increments j otherwise it increments i
 * After the loop terminates it returns j
 *
 */
class solution{
    public static  int removeElement(int[] nums, int val){
        int i=0;
        int j=0;

        while (i < nums.length){
            if (nums[i] !=val){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
    public static void main(String [] args){
        int [] nums={1,2,3,5,3,4,5};
        int val =2;
        int k =removeElement(nums, val);

        System.out.print(Arrays.toString(nums));
        System.out.print(k);
    }
}