/**
 * Remove duplicates from sorted array
 * Question
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted,
 * you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the unique elements in the order
 * they were present in nums initially.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

/**
 * Approach to solve this problem
 * use two pointer
 * i and j, to iterate through the array.
 * The variable j is used to keep track of the current index where a unique element should be placed.
 * The initial value of j is 1
 * since the first element in the array is always unique and doesn't need to be changed.
 * for logic use the for loop / you can also use while loop
 * 1. using for loop logic
 *If the current element nums[i] is not equal to the previous element nums[i - 1],
 *  it means we have encountered a new unique element.
 * In that case, we update nums[j] with the value of the unique element at nums[i],
 * and then increment j by 1 to mark the next position for a new unique element.
 * By doing this, we effectively overwrite any duplicates in the array and only keep the unique elements.
 * Once the loop finishes,
 * the value of j represents the length of the resulting array with duplicates removed.
 *
 * Finally, we return j as the desired result.
 *
 *
 */
 class removeduplicatesSolution {
 public int removeDuplicates(int[] nums) {
  int j = 1;

  for (int i = 1; i < nums.length; i++) {
   if (nums[i] != nums[i - 1]) {
    nums[j] = nums[i];
    j++;
   }
  }
  return j;
 }
}
