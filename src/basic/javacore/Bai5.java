package basic.javacore;

import java.util.Scanner;

public class Bai5 {

	// tinh tong cac chu so cung 1 so
	static int tongChuSo(int n) {
		int sum = 0;
		int soDaTach;
		while (n!=0) {
			soDaTach = n%10;
			n = n/10;
			sum+= soDaTach;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = scanner.nextInt();
		System.out.println(tongChuSo(n));

	}

}
