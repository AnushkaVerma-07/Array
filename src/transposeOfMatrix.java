import java.util.Scanner;

public class transposeOfMatrix {
    static void printMatrix(int[][] matrix){
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] transpose= new int[c][r];
        for(int i=0; i<c; i++){
            for (int j=0; j<r; j++){
                transpose[i][j]= matrix[j][i];
            }
        }
        return transpose;
    }

    static void transposeInPlace(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= temp;


            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Transpose of matrix");
        int[][] transpose = findTranspose(matrix, r, c);
        printMatrix(transpose);
        //transposeInPlace(matrix,r,c);
        //printMatrix(matrix);


    }
}
