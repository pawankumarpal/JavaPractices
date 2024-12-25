package arrayList;

public class SpecialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {4,3,1,6};
		int[][] queries = {{0,2},{2,3}};
		boolean []values= isArraySpecial(nums,queries);
		//System.out.println(values.length);
		printArray(values);
	}
	
	public static boolean[] isArraySpecial(int[] nums, int[][] queries){
        int n = nums.length;

        // Step 1: Precompute alternation status for adjacent elements
        boolean[] isAlternating = new boolean[n - 1];
        for (int i = 0; i < n - 1; i++) {
            isAlternating[i] = (nums[i] % 2 != nums[i + 1] % 2);
        }

        // Step 2: Precompute prefix sums for alternation
        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + (isAlternating[i - 1] ? 1 : 0);
        }

        // Step 3: Process queries in O(1) using precomputed prefix sums
        int qLen = queries.length;
        boolean[] results = new boolean[qLen];
        for (int q = 0; q < qLen; q++) {
            int start = queries[q][0];
            int end = queries[q][1];
            // Check if the range [start, end] is fully alternating
            results[q] = (prefix[end] - prefix[start] == (end - start));
        }

        return results;
    
	}
//	public static boolean calculation(int a,int b, int[] nums) {
//		boolean isEven = nums[a]%2==0;
//		for(int i=a+1;i<=b;i++) {
//			if((nums[i]%2==0) ==isEven) {
//				return false;
//			}
//			isEven= !isEven;
//		}
//		return true;
//	}
//	
	public static void printArray(boolean [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
