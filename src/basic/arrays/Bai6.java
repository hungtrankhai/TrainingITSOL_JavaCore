package basic.arrays;

import java.util.Scanner;

public class Bai6 {
	
	
	static void sapXepTangDan(int[] arr) {
		int tg;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tg = arr[i];
					arr[i] = arr[j];
					arr[j] = tg;
				}

			}
		}
		System.out.println("Mang da sap xep: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	static void chen(int[] arr, int n, int k) {   // XEM LAI
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia tri can chen: ");
		int x = scanner.nextInt();
		
		for (int i = n; i >= k; i--) {
			arr[i] = arr[i-1];
		}
		arr[k] = x;
		n++;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu mang: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap mang: ", arr[i]);
			arr[i] = scanner.nextInt();
		}
		
		sapXepTangDan(arr);
		System.out.println("Nhap vi tri can chen: ");
		int k = scanner.nextInt();
		chen(arr, n, k);
		
		System.out.println("Mang da chen la: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
