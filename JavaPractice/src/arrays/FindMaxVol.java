package arrays;

public class FindMaxVol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] height= {1};
		int max =rerturnMax(height);

        System.out.println(max);
	}
	
	public static int rerturnMax(int[] height) {
		/**int max =0;
        for(int i=0;i<height.length;i++){
            for(int j =i+1;j<height.length;j++){
                int multiple =height[i]>height[j]?height[j]:height[i];
                int temp =multiple*Math.abs(i-j);
                if(temp>max)
                    max =temp;
            }
        }
        return max;*/
		int max = 0;
        int left = 0;  // Start pointer
        int right = height.length - 1;  // End pointer

        while (left < right) {
            // Calculate the area between the two pointers
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;

            // Update max if the current area is larger
            max = Math.max(max, area);

            // Move the pointer pointing to the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
	}

}
