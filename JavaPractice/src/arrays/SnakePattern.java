package arrays;

public class SnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] multi = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<multi.length;i++) {
			if(i%2==0) {
				for(int j=0;j<multi[i].length;j++) {
					System.out.print(multi[i][j]+",");
				}
			}else {
				for(int j=multi[i].length-1;j>0;j--) {
					System.out.print(multi[i][j]+",");
				}
			}

		}
	}

}
