package arrays;

public class FindLargestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 9, 9};
		System.out.println("Data Array:");
		printArr(arr);
		System.out.println();
		int finalArr[] = {arr[0],arr[1],arr[2]};
		
		System.out.println("Start Array Comparison");
		printArr(finalArr);
		System.out.println();
		
		for(int i=2;i<arr.length;i++) {
			int temp = 0;
			int temp2 =0;
			if(arr[i]>finalArr[0]) {
				temp = finalArr[0];
				finalArr[0] =arr[i];
				if(temp>finalArr[1]) {
					temp2= finalArr[1];
					finalArr[1] = temp;
					if(temp2>finalArr[2]) {
						finalArr[2] =temp2;
					}
				}
			}else if(arr[i]>finalArr[1]) {
				temp2= finalArr[1];
				finalArr[1] = arr[i];
				if(temp2>finalArr[2]) {
					finalArr[2] =temp2;
				}
			}else if(arr[i]>finalArr[2]) {
				finalArr[2] =arr[i];
			}
		}
		System.out.println("After Array Comparison");
		printArr(finalArr);
	}
	
	public static void printArr(int arr[]) {
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+",");
		}
	}

}
