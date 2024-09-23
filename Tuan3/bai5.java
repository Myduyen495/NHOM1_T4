import java.util.Scanner;

public class bai5 {
	static double a;
	static double b;
	static double c;
	static Scanner sc;
	
	static void Nhap() {
		sc=new Scanner(System.in);
		System.out.print("Nhập cạnh a = "); 
		a=sc.nextDouble();
		sc=new Scanner(System.in);
		System.out.print("Nhập cạnh b = "); 
		b=sc.nextDouble();
		sc=new Scanner(System.in);
		System.out.print("Nhập cạnh c = "); 
		c=sc.nextDouble();
	}
	
	static void Giai() {
		if ((a+b > c)&&(a+c > b)&&(b+c > a))
            if (a == b && b == c)
                System.out.println("Đây là tam giác đều.");
            else if (a == b || a == c || b == c) 
                System.out.println("Đây là tam giác cân.");
            else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
                System.out.println("Đây là tam giác vuông.");
            else
                System.out.println("Đây là tam giác thường.");
		else
            System.out.println("Ba cạnh không tạo thành một tam giác.");
	}

	public static void main(String[] args) {
		Nhap();
		Giai();
	}
}