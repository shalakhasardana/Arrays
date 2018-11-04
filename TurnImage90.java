package Arrays;
//Turn an image by 90 degree
public class TurnImage90 {

	public int[][] rotate(int[][] matrix) {
		int n=matrix.length;
		for(int i=0;i<n/2;i++){
			int last=n-i-1;
			for(int j=i;j<last;j++){
				int t=matrix[i][j];
				matrix[i][j]=matrix[n-1-j][i];
				matrix[n-1-j][i]=matrix[n-i-1][n-j-1];
				matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
				matrix[j][n-i-1]=t;
			}
		}
		return matrix;
	}

	public void printRotateMatrix(int[][] array) {
		int[][] rotateArray=rotate(array);
		for(int i=0;i<rotateArray.length;i++) {
			for(int j=0;j<rotateArray.length;j++) {
				System.out.print(rotateArray[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
