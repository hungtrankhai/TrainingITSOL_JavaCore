package basic.javacore;

import java.awt.Checkbox;
import java.util.Scanner;

public class Bai8 {          // check lai func kiem tra

//	static boolean checkSoThuanNghich(int n) {
//
//		int[] arr = new int[n];
//		// phan tich so n thanh cac chu so va luu vao 1 mang
//		// tach so
//		int soDaTach;
//		while (n != 0) {
//			soDaTach = n % 10;
//			n = n / 10;
//
//			// add cac so da tach vao 1 mang
//			for (int i = 0; i < n; i++) {
//				arr[i] = soDaTach;
//			}
//		}
//
//		// kiem tra thuan nghich
//		for (int i = 0; i < (arr.length/2); i++) {
//			if (arr[i] != arr[(arr.length - 1 -i)]) {
//				return false;
//			}
//		}
//
//		return true;
//
//	}

	static boolean checkSoThuanNghich(int n) {    // hoc laij func nay
		int sum=0, soBanDau, soConLai;
		
		soBanDau = n;
		while (n!=0) {
			soConLai = n%10;
			sum = sum *10 + soConLai;
			n /=10;
			
		}
		if(soBanDau != sum) {
			return false;
		}
			
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap n: ");
//		int n = scanner.nextInt();

		for (int i = 100001; i <= 999999; i++) {
			if (checkSoThuanNghich(i)) {
				System.out.println(i);
			}
		}

//		checkSoThuanNghich(n);

	}

}
