import java.util.Scanner;
class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first matrix
        System.out.println("Enter no. of rows of first matrix");
        int m1 = sc.nextInt();
        System.out.println("Enter no. of columns of first matrix");
        int n1 = sc.nextInt();
        int A[][] = new int[m1][n1];
        
        // Fill first matrix
        for (int i = 0; i < m1; i++) {  // Index should start from 0
            for (int j = 0; j < n1; j++) {  
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter no. of rows of second matrix");
        int m2 = sc.nextInt();
        System.out.println("Enter no. of columns of second matrix");
        int n2 = sc.nextInt();
        int B[][] = new int[m2][n2];

        // Fill second matrix
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {  
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }
        if (n1 == m2) {
            int C[][] = new int[m1][n2];

            // Matrix multiplication
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < n1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Output the result
            System.out.println("Resultant matrix after multiplication:");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible");
        }
    }
}
