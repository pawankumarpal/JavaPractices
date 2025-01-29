package greedy;

import com.printer.PrintArray;

public class NapSec {
    class Job implements Comparable<Job> {
        int valWeight, weight, value;

        public Job(int valWeight, int weight, int value) {
        	this.valWeight = value / weight;
            this.weight = weight;
            this.value = value;
            System.out.println(value);
        }

        @Override
        public int compareTo(Job other) {
            return other.valWeight - this.valWeight; // Sort by profit in descending order
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PrintArray pa = new PrintArray();
        int sum=0;
        int cap =50;
        int currCap = cap;

        int wt[] = {10, 20, 30};
        int val[] = {60, 100, 120};

        int n = val.length;

        int valWeight[] = new int[n];

        for (int i = 0; i < n; i++) {
            valWeight[i] = val[i] / wt[i];
        }

       	pa.printSimpleImtArray(valWeight);

        NapSec ns = new NapSec();
        
        Job[] jobs = new Job[n];

        // Initialize jobs
        for (int i = 0; i < n; i++) {
            jobs[i] = ns.new Job((val[i]/wt[i]), wt[i], val[i]);
        }
        for (Job op : jobs) {
        	if(op.weight<=currCap) {
        		currCap -=op.weight;
        		sum +=op.value;
        	}else {
        		sum +=(op.value)*(currCap/op.weight);
        		System.out.println(sum);
        		break;
        	}
        }
        System.out.println(sum);
//        Job job = new Job();
//        for (int j = 0; j < val.length; j++) {
//            job = ns.new Job(valWeight[j], wt[j], val[j]);
//            // Perform operations with the job objects as needed
//        }
//        

    }
}
    