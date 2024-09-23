import java.util.Scanner;

public class Tuan3bai3 {
	static double a;
	static double b;
	static double c;
	static Scanner sc;
	static double x1;
	static double x2;
	static double x;
	static double delta;
	
	static void Nhap() {
		sc=new Scanner(System.in);
		System.out.print("Nhập hệ số a = "); 
		a=sc.nextDouble();
		sc=new Scanner(System.in);
		System.out.print("Nhập hệ số b = "); 
		b=sc.nextDouble();
		sc=new Scanner(System.in);
		System.out.print("Nhập hệ số c = "); 
		c=sc.nextDouble();
	}
	
	static double tinhDelta() {
		return delta = b * b - 4 * a * c;
	}
	
	static void Giai() {
		if (a==0)
			if (b==0)
				if (c==0) System.out.println("phương trình có vô số nghiệm");
				else System.out.println("phương trình vô nghiệm");
			else { x = -c/b;
				System.out.println("Phương trình có nghiệm : x = " + x); }
		else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2); }
			else if (delta == 0) { x = -b / (2 * a);
					System.out.println("Phương trình có nghiệm kép: x = " + x); } 
				else System.out.println("Phương trình vô nghiệm.");
	}
	
	public static void main(String[] args) {
		Nhap();
		tinhDelta();
		Giai();
	}
}
