package basic.javacore;

import java.util.Scanner;

public class Bai3 {
	
	// ctrl + shirf + F to format code

	// tim UCLN va BCNN cua int a,b
	
	
    static int tinhUCLN(int a, int b) {
    	if(a==b) {
    		System.out.println("UCLN cua a&b: "+a);
    	}
    	
    	while(a!=b) {
    		if(a>b) a-=b;
    		else b-=a;
    	}   System.out.println("UCLN cua aa&b: "+a);
  
    	 return 1;
	}
	
    static int tinhBCNN(int a, int b) {
    	
    	int bcnn = (a*b)/tinhUCLN(a, b);
    	System.out.println("BCNN: "+bcnn);
    	return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();
		
		tinhUCLN(a, b);
		tinhBCNN(a, b);
		
		
		

	}

}
