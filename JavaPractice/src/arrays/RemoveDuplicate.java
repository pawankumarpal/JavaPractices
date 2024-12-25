package arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 3, 3, 4, 5};
		String removedStr= remove(arr);
		String distinctList []= (removedStr.split("~")[0]).split(",");
		int distictArr[] = new int [Integer.valueOf(removedStr.split("~")[1])];
		for(int i=0;i<distictArr.length;i++) {
			distictArr[i]=Integer.valueOf(distinctList[i]);
			System.out.println(distictArr[i]);
		}
	}
	
	public static String remove(int [] a) {
		String distinct = "";
		int count = 0;
		for(int i=0;i<a.length;i++) {
			if(!distinct.contains(String.valueOf(a[i]))) {
				distinct = distinct.concat(String.valueOf(a[i])).concat(",");
				count++;
			}
		}
		distinct.trim();
//		int distinctArr []= new int [count+1];
//		for(int j =0;j<distinctArr.length;j++) {
//			distinctArr[j] = 
//		}
		return distinct+"~"+count;
	}

}
