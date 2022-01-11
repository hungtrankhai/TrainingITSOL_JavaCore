package basic.javacore;

import java.util.Scanner;

public class Bai1 {

//	nhap so nguyen n va viet ctrinh tinh tong
	
//	1-a
	static int tinhTong1a(int n) {
		int sum =0;
		if(n%2==0) {
			for (int i = 2; i <= n; i+=2) {
				sum +=i;
			}
			System.out.println("Tong so chan la: "+sum);
				
			
		} else {
			for (int i = 1; i <= n; i+=2) {
				
				sum +=i;
			}
			System.out.println("Tong so le la: "+sum);
		}
		
		return 1;
	}
	
	//1-b
	static int tinhTong1b(int n) {
		float sum = 1;
		for (int i = 2; i <= n; i++) {
			sum += (double)1/i;
		}
		System.out.printf("Tong la: %.2f ", sum);
		
		return 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		tinhTong1a(n);
		tinhTong1b(n);
		
	}

}
