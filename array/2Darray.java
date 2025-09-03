// Description: Printing a 2D array
public class Matrix1 {
	public static void main(String[] args) {		
		int [] [] matrix= {
				{1,2,3},
				{4,5,6,7},
				{8,9},
		};
		for (int i=0;i<matrix.length;i++) {//matrix.length gives number of rows
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();			
		}
	}
}
