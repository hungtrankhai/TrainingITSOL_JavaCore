package basic.javacore;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Bai10 {      

	
	static boolean checkSoNguyenTo(int n) {

		if (n <= 2) {
			return false;
		}

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// tach 
	static boolean checkChuSoCuaSoDaTachXemNguyenToKo(int n) {       // note
		int soDaTach;
		while (n != 0) {
			soDaTach = n % 10;
			n = n / 10;
			if (soDaTach % 2 == 0) {
				return false;

			}
			checkSoNguyenTo(soDaTach);
		}

		return true;
	}

	static int soNghichDao(int n) {

		int tg, soNghichDao = 0;
		while (n > 0) {
			tg = n % 10;
			soNghichDao = soNghichDao * 10 + tg;
			n /= 10;
		}
//		System.out.println(soNghichDao);
		return soNghichDao;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap n: ");
//		int n = scanner.nextInt();

		int count = 0;

		for (int i = 1000000; i < 9999999; i++) {
 
			if (checkSoNguyenTo(i) && checkChuSoCuaSoDaTachXemNguyenToKo(i) && checkSoNguyenTo(soNghichDao(i)) ) {
					 
			
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
//		System.out.println(checkChuSoCuaSoDaTachXemNguyenToKo(1));
//		soNghichDao(n);

	}

}
