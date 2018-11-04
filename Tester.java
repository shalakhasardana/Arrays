package Arrays;

public class Tester {

	public static void main(String[] args) {
		/*//Turn an image by 90 degree
		TurnImage90 obj=new TurnImage90();
		int[][] array_2= {{1,2},{4,3}};
		int[][] array_3= {{1,2,3},{8,9,4},{7,6,5}};
		int[][] array_4= {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
		int[][] array_5=  { { 1, 2, 3,4,5},
				{ 6,7,8,9,10 }, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25} };
    	obj.printRotateMatrix(array_2);
    	System.out.println(" ");
    	obj.printRotateMatrix(array_3);
    	System.out.println(" ");
    	obj.printRotateMatrix(array_4);
    	System.out.println(" ");
    	obj.printRotateMatrix(array_5);
    	System.out.println(" ");*/
		
		
		
		
		//write an algo such that if an element in an m*n matrix is 0, its entire row and column are set to 0
		int[][] array=  { { 0, 2, 3,4,5},
				{ 6,7,8,9,10 }, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,0} };
		TurnZero obj=new TurnZero();
		obj.getMatrixAfterZero(array);
	}
}
