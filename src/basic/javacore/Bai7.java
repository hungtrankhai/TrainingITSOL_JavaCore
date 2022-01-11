package basic.javacore;

import java.util.Scanner;

public class Bai7 {
	
	// viet 1 ham check so ngto va 1 ham kiem tra 1 so xem co cac chu so le hay ko, roi dieu kien cung nhau &&
	
	 static boolean checkSoNguyenTo(int n) {
		
		if(n<=2) {
			return false;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	// check xem cac chu so cua n co phai le hay ko 
	static boolean checkChuSoXemCoLeKo(int n) {
		
		int soDaTach =n;
		
		while (n!=0) {
			soDaTach = n%10;
			n = n/10;
			if(soDaTach%2==0) {
				return false;
			}
		}
		
		return true;
	}

	
	// liet ke cac so nguyen to co 6 chu so, chi bao gom so le
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 100001; i <= 999999; i+=2) {
			if (checkChuSoXemCoLeKo(i) && checkSoNguyenTo(i)) {
				System.out.println(i);
				count++;
			}
			
			
		} 
		System.out.println(count);
		

	}

}
