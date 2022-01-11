package basic.arrays;

import java.util.Scanner;

public class Bai1 {

	static void checkDoiXung(int a[], int n) {
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != a[n - 1 - i])
				dem++;
		}
		if (dem == 0)
			System.out.println("Mang doi xung");
		else
			System.out.println("Mang ko doi xung");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu mang: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap phan tu thu %d: ",i);
			arr[i] = scanner.nextInt();
		}
		
		checkDoiXung(arr, n);
		

	}

}
