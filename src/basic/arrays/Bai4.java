package basic.arrays;

import java.util.Scanner;

public class Bai4 {
	
	// nhap mang (a,n) va nhap X. xac dinh gia tri trong mang gan nhat voi X.

	
	static void sapXepTangDan(int[] arr) {
		int tg;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tg = arr[i];
					arr[i] = arr[j];
					arr[j] = tg;
				}

			}
		}
		System.out.println("Mang da sap xep: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
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
		
//		sapXepTangDan(arr);
		
		System.out.println("Nhap X: ");
		int x= scanner.nextInt();
		int c=0, h;
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(x-arr[j] < x-arr[i] )
					
				while (c>0) {
					break;
				}
				System.out.println("So gan nhat voi "+x+" la: "+arr[j]);
			
//				else if(arr[i] - x < arr[j]-x) {
//					System.out.println("So gan nhat voi "+x+" la: "+arr[i]);
//					c++;
//				}
//				if(c>0) break;
				
			}
			
		}
		

	}

}
