package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DistinctTripletSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		/**List<List<Integer>> returnList = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
		    int temp = nums[i];
		    List<Integer> elements = new ArrayList<>(2);
		    elements.add(nums[i]);
		    for (int j = i + 1; j < nums.length; j++) {
		        elements.add(nums[j]);
		        temp += nums[j];
		        System.out.println(temp);
		        System.out.println(elements);
		        if (elements.size() == 3 && temp == 0) {
		        	Collections.sort(elements);
		        	if(!returnList.contains(elements))
		            returnList.add(new ArrayList<>(elements)); // Create a copy of `elements`
		            System.out.println("Return List:"+returnList);
		            elements.clear();
		            temp = nums[i];
		            elements.add(nums[i]);
		            j--;
		        } else if (elements.size() == 3) {
		            elements.clear();
		            temp = nums[i];
		            elements.add(nums[i]);
		            j--;
		        }
		        
		    }
		}
		/**for (int i = nums.length-1; i >= 0; i--) {
		    int temp = nums[i];
		    List<Integer> elements = new ArrayList<>(2);
		    elements.add(nums[i]);
		    for (int j = i - 1; j >= 0; j--) {
		        elements.add(nums[j]);
		        temp += nums[j];
		        System.out.println(temp);
		        System.out.println(elements);
		        if (elements.size() == 3 && temp == 0) {
		        	Collections.sort(elements);
		        	if(!returnList.contains(elements))
		            returnList.add(new ArrayList<>(elements)); // Create a copy of `elements`
		            System.out.println("Return List:"+returnList);
		            elements.clear();
		            temp = nums[i];
		            elements.add(nums[i]);
		            j++;
		        } else if (elements.size() == 3) {
		            elements.clear();
		            temp = nums[i];
		            elements.add(nums[i]);
		            j++;
		        }
		        
		    }
		}
		System.out.println("Final Return List:"+returnList);
		printList(returnList);*/
		List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        String temp="";
        for(int i=0;i<nums.length;i++) {
        	 temp = temp.concat(nums[i]+",");
        }
        System.out.println("Array:"+temp);
        // Sort the array to handle duplicates and use two-pointer technique

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for `i`
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                System.out.println(sum);
                System.out.println(nums[i]+"--"+nums[left]+"--"+nums[right]);
                if (sum == 0) {
                	
                    // Add the triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    System.out.println(result);
                    // Skip duplicates for `left` and `right`
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    System.out.println(left+"--"+right);
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Increase the left pointer to increase the sum
                } else {
                    right--; // Decrease the right pointer to decrease the sum
                }
            }
        }

        System.out.println("Final Return List:"+result);
	}
	

	
	public static void printList(List<List<Integer>> returnList) {
        for (List<Integer> innerList : returnList) {
            for (Integer num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line after each inner list
        }
	}
	

}
