package basic.javacore;

public class Bai9 {

	// check so thuan nghich
	static boolean checkSoThuanNghich(int n) {    // hoc laij func nay
		int sum=0, soBanDau, soConLai;
		
		soBanDau = n;
		while (n!=0) {
			soConLai = n%10;
			sum = sum *10 + soConLai;
			n /=10;
			
		}
		if(soBanDau != sum) {
			return false;
		}
			
		return true;
	}

	static boolean dieuKien2(int n) {

		int soDaTach = n;

		while (n != 0) {
			soDaTach = n % 10;
			n = n / 10;
			if (soDaTach != 0 && soDaTach != 6 && soDaTach != 8) {
				return false;
			}
		}
		return true;
	}

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
		int count = 0;
		for (int i = 1000000; i < 999999999; i++) {

			if (dieuKien2(i) && checkSoThuanNghich(i) && tongChuSo(i)%10==0 ) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);

	}

}
