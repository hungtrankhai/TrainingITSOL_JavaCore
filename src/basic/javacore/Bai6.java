package basic.javacore;

import java.util.Scanner;

public class Bai6 {

	// phan tich 1 so thanh thua so nguyen to
	
	
	static int phanTichSo(int n) {
	
		for (int i = 2; i <=n; i++) {
			while (n%i==0) {
			 n/=i;
				
			}
			if (n>0) {
				 System.out.print(i+"x");
			}
			
		}
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = scanner.nextInt();
		
		phanTichSo(n);

	}

}
