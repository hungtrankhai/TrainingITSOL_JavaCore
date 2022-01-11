package basic.javacore;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n=scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				System.out.println(i);
			    sum++;
			}
		}
		System.out.println("Tong so cac uoc cua n la: "+sum);
		
		
	}

}
