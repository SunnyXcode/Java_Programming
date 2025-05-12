package matrix;

import java.util.Scanner;

public class Spiral_Matrix {

    public void printMatrix(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void spiral(int arr[][]) {
        int i, k = 0, l = 0;
        int row = arr.length;
        int col = arr[0].length;
        while (k < row && l < col) {
            for (i = l; i < col; i++) {
                System.out.print(arr[k][i] + " ");
            }
            k++;
            for (i = k; i < row; i++) {
                System.out.print(arr[i][col - 1] + " ");
            }
            col--;
            if (k < row) {
                for (i = col - 1; i >= l; i--) {
                    System.out.print(arr[col][i] + " ");
                }
            }
            row--;
            if (l < col) {
                for (i = col - 1; i >= k; i--) {
                    System.out.print(arr[i][l] + " ");
                }
            }
            l++;

        }

    }

    public static void main(String[] args) {
        Spiral_Matrix matrix = new Spiral_Matrix();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row and col of matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        matrix.printMatrix(arr);

        System.out.println("Spiral matrix:");
        matrix.spiral(arr);

    }

}
