package Arrays;
//write an algo such that if an element in an m*n matrix is 0, its entire row and column are set to 0
public class TurnZero {

	public void getMatrixAfterZero(int[][] array) {
		int[][] matrix=matrixAfterZeroUtil(array);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j] +"");
			}
			System.out.println("");
		}
		
	}

	private int[][] matrixAfterZeroUtil(int[][] matrix) {
		int[] row=new int[matrix.length];
		int[] column=new int[matrix[0].length];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==0) {
					row[i]=1;
					column[j]=1;
				}
		     }
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(row[i]==1||column[j]==1) {
					matrix[i][j]=0;
				}else {
					continue;
				}
		     }
		}		
		
	
		return matrix;
	}
	
	
	

}
