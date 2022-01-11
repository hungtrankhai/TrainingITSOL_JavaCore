package basic.arrays;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
    	//
        int n;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Nhap so phan tu mang 1: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        System.out.println("Nhap gia tri mang 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        do {
            System.out.println("Nhap so phan tu mang 2: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int B[] = new int[n];
        System.out.println("Nhap gia tri mang 2: ");
        for (int i = 0; i < n; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = scanner.nextInt();
        }
        System.out.println("Nhap X:");
        Integer number = scanner.nextInt();
        int mangDaChen[] = mangDaChen(A,B,number);
        for(int i=0;i<=mangDaChen.length-1;i++){
            System.out.println(mangDaChen[i]);
        }

    }

    public static int[] mangDaChen(int[] a,int[] b, int k){
        int [] c= new int[a.length+b.length];
        System.out.println("c L:"+c.length);
        for(int i=0;i<=k-1;i++){
            c[i]=a[i];
        }
        for(int i=k,t=0; i<=k+b.length-1;i++){
            c[i]=b[t];
            t++;
        }
        for(int i=k+b.length;i<=c.length-1; i++ ){
            c[i]=a[k];
            k=k+1;
        }
        return c;
    }


}