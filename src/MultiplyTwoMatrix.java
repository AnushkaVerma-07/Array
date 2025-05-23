import java.util.Scanner;

public class MultiplyTwoMatrix {
    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][]a, int r1, int c1, int[][]b, int r2, int c2){
        if(r1!=c1 || r2!=c2){
            System.out.println("Wrong Dimension: Multiplication not possible");
        }
        int[][] multiply =new int[r1][c1];
        for(int i=0;i<r1 ; i++){
            for(int j=0; j<c1; j++){
                multiply[i][j]= a[i][j]* b[j][i];
            }
        }
        System.out.println("Multiply is:");
        printMatrix(multiply);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix 1:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter matix 1 values");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter matix 2 values");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);
        multiply(a, r1, c1, b, r2, c2);
    }
}
