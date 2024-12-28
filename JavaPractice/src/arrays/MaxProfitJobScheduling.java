package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProfitJobScheduling {

	 static class Job {
	        int start, end, profit;

	        Job(int start, int end, int profit) {
	            this.start = start;
	            this.end = end;
	            this.profit = profit;
	        }
	    }

	    public static int getMaxProfit(int[] startTime, int[] endTime, int[] profit) {
	        int n = startTime.length;
	        Job[] jobs = new Job[n];

	        // Create Job objects
	        for (int i = 0; i < n; i++) {
	            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
	        }

	        // Sort jobs by their end times
	        Arrays.sort(jobs, Comparator.comparingInt(job -> job.end));

	        // Array to store the maximum profit at each job
	        int[] dp = new int[n];
	        dp[0] = jobs[0].profit;

	        // Iterate through jobs to calculate max profit
	        for (int i = 1; i < n; i++) {
	            // Include current job's profit
	            int includeProfit = jobs[i].profit;

	            // Find the last non-overlapping job using binary search
	            int lastNonOverlappingJob = binarySearch(jobs, i);
	            if (lastNonOverlappingJob != -1) {
	                includeProfit += dp[lastNonOverlappingJob];
	            }

	            // Store the maximum profit by including or excluding the current job
	            dp[i] = Math.max(dp[i - 1], includeProfit);
	        }

	        // Maximum profit is stored in the last cell
	        return dp[n - 1];
	    }

	    // Binary search to find the last non-overlapping job
	    private static int binarySearch(Job[] jobs, int index) {
	        int low = 0, high = index - 1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (jobs[mid].end <= jobs[index].start) {
	                if (jobs[mid + 1].end <= jobs[index].start) {
	                    low = mid + 1;
	                } else {
	                    return mid;
	                }
	            } else {
	                high = mid - 1;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        // Example input
	        int[] startTime = {1, 2, 3, 3};
	        int[] endTime =   {3, 4, 5, 6};
	        int[] profit =    {50,10, 40, 70};

	        System.out.println(getMaxProfit(startTime, endTime, profit)); // Output: 120
	    }

}
