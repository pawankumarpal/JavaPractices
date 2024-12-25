package arrays;
import java.math.*;
import java.util.Arrays;

public class ClosestSumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-4,2,2,3,3,3}; int target =0;
		int sum = threeSumClosest(nums, target);
		System.out.println(sum);
		
	}
    public static int threeSumClosest(int[] nums, int target) {
        // Edge case: If the array has fewer than 3 elements, we can't form a triplet
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("Array must have at least 3 elements.");
        }

        // Sort the array to enable the two-pointer approach
        Arrays.sort(nums);

        // Initialize the closest sum to the first possible triplet sum
        int closest = nums[0] + nums[1] + nums[2];

        // Iterate over the array, considering each element as the first element of the triplet
        for (int i = 0; i < nums.length - 2; i++) {
            // Set up two pointers: left starts after i, right starts at the end
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                // Calculate the sum of the current triplet
                int sum = nums[i] + nums[left] + nums[right];

                // Update the closest sum if the current sum is closer to the target
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers based on the comparison between sum and target
                if (sum < target) {
                    left++; // Increase the sum by moving the left pointer
                } else if (sum > target) {
                    right--; // Decrease the sum by moving the right pointer
                } else {
                    // If sum equals the target, it is the closest possible sum
                    return sum;
                }
            }
        }

        // Return the closest sum found
        return closest;
    }
}
