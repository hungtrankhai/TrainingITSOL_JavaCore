package basic.arrays;

import java.util.Scanner;

public class Bai7 {
	
	// so sánh 2 vị trí lien tiếp nhau.
	// đếm số lần mà a[i] < a[j],  nếu bị break thì lưu biến đếm vào 1 mảng int[] arrDem.
	// sau đó tìm phần tử lớn nhât mảng int[] arrDem.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu mang: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap gia tri %d: ",i);
			arr[i] = scanner.nextInt();
		}
		
		
		
		
		
		
		
	}

}
