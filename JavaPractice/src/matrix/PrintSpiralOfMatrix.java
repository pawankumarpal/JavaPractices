package matrix;

public class PrintSpiralOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16 } };
		PrintSpiralOfMatrix ps = new PrintSpiralOfMatrix();

		ps.printSpiral(mat);

	}

	public void printSpiral(int[][] mat) {
		int colLength = mat.length-1;
		int rowLength = mat[0].length - 1;
		int l =0;
		for (int i = 0; i < colLength; i++) {
			System.out.println("Loop");
			for (int j = l; j < mat.length; j++) {
				//if()
				System.out.println("LoopIn");
				System.out.print(mat[i][j] + ",");
				if (j == colLength) {
					printColumn(mat, rowLength, colLength, i);
				}
			}
			colLength--;
			l++;
			rowLength--;
		}
	}

	public void printColumn(int[][] mat, int rowLength, int colLength, int i) {
		System.out.println("Inside");
		for (int j = i + 1; j < rowLength + 1; j++) {
			System.out.print(mat[j][colLength] + ",");
			if (j == rowLength) {
				//System.out.println("jj");
				printLastRow(mat, rowLength, colLength, j, i);
			}
		}
		System.out.println();
	}

	public void printLastRow(int[][] mat, int rowLength, int colLength, int j, int i) {
		System.out.println("printLastRow");

		for (int k = j - 1; k>=i; k--) {
			System.out.print(mat[rowLength][k]+",");
			if(k==i) {
				printUps(mat, rowLength, colLength, j, i);
			}
		}
	}
	
	public void printUps(int[][] mat, int rowLength, int colLength, int j, int i) {
		System.out.println("printUps");
		for(int l =rowLength-1;l>i;l--) {
			System.out.print(mat[l][i]+",");
		}
	}

}
