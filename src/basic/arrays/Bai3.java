package basic.arrays;

import java.util.Scanner;

public class Bai3 {
	
	static void demSoLanXuatHien(int[] arr) {
		int count;
		int i;
		for(i=0;i<arr.length-1;i++) {
			count=1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					
				}
			}
			System.out.println("So "+arr[i]+"xuat hien "+count+" lan");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu mang: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap phan tu thu %d: ",i);
			
			arr[i] = scanner.nextInt();
		}
		
		demSoLanXuatHien(arr);

	}

}
