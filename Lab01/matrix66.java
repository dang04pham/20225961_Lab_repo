import java.util.Scanner;

public class matrix66 {
    static int [][] add(int A[][], int B[][], int row, int column){
        int i, j;
        int C[][] = new int[row][column];
        for(i = 0; i < row; i++){
            for(j = 0; j < column; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    static void displayMatrix(int A[][], int row, int column){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of Matrix A:");
        int a, b;
        System.out.println("enter number of rows: ");
        a = sc.nextInt();
        System.out.println("enter number of columns");
        b = sc.nextInt();

        System.out.println("enter the size of Maxtrix B:");
        int c, d;
        System.out.println("enter number of rows: ");
        c = sc.nextInt();
        System.out.println("enter number of columns");
        d = sc.nextInt();

        if(a != c || b != d){
            System.out.println("Cannot add 2 matrices of different size");
        }

        else{
            int [][]A = new int[a][b];
            System.out.println("enter values for Matrix A");
            for(int i = 0; i < a; i++){
                for(int j = 0; j < b; j++){
                    A[i][j] = sc.nextInt();
                }
            }

            int [][]B = new int[c][d];
                for(int i = 0; i < a; i++){
                    for(int j = 0; j < b; j++){
                        B[i][j] = sc.nextInt();
                }
            }

            int res[][] = new int[a][b];
            res = add(A, B, c, d);
            displayMatrix(res, a, b);
        }

        sc.close();
    }
}

