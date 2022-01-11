package basic.javacore;

import java.util.Scanner;

// viet ctrinh in ra cac cap so nguyen to cung nhau trong doan [a,b]

//	Số nguyên tố cùng nhau được hiểu là những cặp số có ước số chung lớn nhất là 1.
//	vd: 6 va 25

public class Bai4 {
//	static int UCLN(int a, int b) {
//		int uc = 0;
//		for (int i = 1; i <= a && i <= b; i++) {
//			if (a % i == 0 && b % i == 0) {
//				uc = i;
//			}
//		}
//		return uc;
//	}
	static int tinhUCLN(int a, int b) {
//    	if(a==b) {
//    		System.out.println("UCLN cua a&b: "+a);
//    	}
    	
    	while(a!=b) {
    		if(a>b) a-=b;
    		else b-=a;
    	}   
    	 return a;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a:");
		int a = scanner.nextInt();
		System.out.println("Nhap b:");
		int b = scanner.nextInt();
		if (a>b) {
			a = b ;              //(a - (b = a))
		}
		System.out.printf("Cac cap so ngto cung nhau trong doan [%d,%d] la: ",a,b);
		for (int i = a; i <= b; i++) {
			for (int j = i + 1; j <= b; j++) {
				if (tinhUCLN(i, j) == 1) {
					System.out.println(i + " " + j);
				}
			}
		}

	}
}