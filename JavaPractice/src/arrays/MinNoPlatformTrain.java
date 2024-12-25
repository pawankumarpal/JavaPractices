package arrays;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MinNoPlatformTrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinNoPlatformTrain mnp = new MinNoPlatformTrain();
		String arr[] = { "9:00", "9:40", "9:50", "11:00", "15:00", "18:00" };
		String dep[] = { "9:10", "12:00", "11:20", "11:30", "19:00", "20:00" };

		System.out.println(mnp.countPlatforms(arr, dep));
	}

	public int countPlatforms(String arr[], String dept[]) {
		ArrayList<String> parkedTrainDept = new ArrayList<String>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");

		for (int i = 0; i < arr.length-1; i++) {
			LocalTime nextTrainArrival = LocalTime.parse(arr[i+1], formatter);
			LocalTime deptTime = LocalTime.parse(dept[i], formatter);
			ArrayList<String> checkArray = new ArrayList<String>();
			checkArray = searchEmptyPlatform(parkedTrainDept, nextTrainArrival, LocalTime.parse(dept[i+1], formatter));
			if (!checkArray.equals(parkedTrainDept)) {
				parkedTrainDept = checkArray;
			} else if(deptTime.isAfter(nextTrainArrival)){
				parkedTrainDept.add(deptTime.toString());
			}
		}
		System.out.println(parkedTrainDept);
		return parkedTrainDept.size();
	}

	public ArrayList<String> searchEmptyPlatform(ArrayList<String> parkedTrainDept, LocalTime nextTrainArrival,
			LocalTime dept) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
		for (int i = 0; i < parkedTrainDept.size(); i++) {
			LocalTime timePresernt = LocalTime.parse(parkedTrainDept.get(i),formatter);
			if (timePresernt.isBefore(nextTrainArrival)) {
				parkedTrainDept.remove(i);
				parkedTrainDept.add(dept.toString());
				return parkedTrainDept;
			}
		}
		return parkedTrainDept;
	}

}
