package basic.arrays;

import java.util.Scanner;

public class Bai8 {

	/*
	 *   A[m][n] * B[n][k]
	 * 
	 * */
	
	public static void main(String[] args) {
        int m,n,k;

        Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so hang cua A");
            m = sc.nextInt();
            System.out.println("Nhap so cot cua A va so hang cua B ");
            n = sc.nextInt();
            System.out.println("nhap so cot cua B");
            k = sc.nextInt();
            int[][] A = new int[m][n];
            int[][] B = new int[n][k];
            int[][] C = new int[m][k];
            System.out.println("Nhap phan tu ma tran A: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.println("Nhap phan tu ma tran B: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print("B[" + i + "][" + j + "] = ");
                    B[i][j] = sc.nextInt();
                }
            }
            
            
            System.out.println("Ma tran A: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("\n");
            }

            System.out.println("Ma tran B: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(B[i][j] + "\t");
                }
                System.out.println("\n");
            }
            
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    C[i][j] = 0;
                    for (int y = 0; y < n; y++) {
                        C[i][j] = C[i][j] + A[i][y] * B[y][j];
                    }
                }
            }
            System.out.println("Ma tran tich la: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println("\n");
            }
    }
}
