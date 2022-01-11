package basic.arrays;

import java.util.Scanner;

public class Bai2 {

	//

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
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu mang: ");
		 int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap phan tu thu %d: ", arr[i]);
			
			arr[i] = scanner.nextInt();
		}

		sapXepTangDan(arr);

	}

}
