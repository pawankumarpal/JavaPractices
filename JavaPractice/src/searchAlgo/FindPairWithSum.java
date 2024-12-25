package searchAlgo;

import java.util.Arrays;

public class FindPairWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindPairWithSum fpws = new FindPairWithSum();

		int[] arr = { 3, 5, 9, 2, 8, 10, 11 };
		int number = 19;
		int[] newArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(newArr);// {2,3,5,8,9,10,11}
		int left = 0;
		int right = newArr.length - 1;
		System.out.println(fpws.foundNumber(newArr, left, right, number));
	}

	public boolean foundNumber(int[] newArr, int left, int right, int number) {
//		if(left !=right) {
//			if(newArr[left]+newArr[right]==number) {
//				return true;
//			}
//			
//			if(newArr[left]+newArr[right]>number) {
//				foundNumber(newArr, left, right-1, number);
//			}else if(newArr[left]+newArr[right]<number) {
//				foundNumber(newArr, left+1, right, number);
//			}
//		}
		while (left < right) {
			if (newArr[left] + newArr[right] == number) {
				return true;
			}

			if (newArr[left] + newArr[right] > number) {
				right--;
			} else if (newArr[left] + newArr[right] < number) {
				left++;
			}
		}
		return false;
	}

}
