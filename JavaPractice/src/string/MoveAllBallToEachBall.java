package string;

import java.util.ArrayList;

import com.printer.PrintArray;

public class MoveAllBallToEachBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveAllBallToEachBall mabtb = new MoveAllBallToEachBall();
		PrintArray pa = new PrintArray();
		String boxes = "110";
		
		pa.printSimpleImtArray(mabtb.minOperations(boxes));
	}

	public int[] minOperations(String boxes) {
		// Prefix
        int [] ans = new int[boxes.length()];
        ArrayList<Integer> distance = new ArrayList<Integer>();

        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                distance.add(i);
            }
        }

        for(int i=0;i<boxes.length();i++){
            int sum=0;
            for(int j=0;j<distance.size();j++){
                sum+=Math.abs(i-distance.get(j));
            }
            ans[i] = sum;
        }
        return ans;

	}

}
