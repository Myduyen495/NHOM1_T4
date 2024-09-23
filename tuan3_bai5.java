import java.util.Scanner;

public class tuan3_bai5 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ba canh cua tam giac");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a+b>c && a+c>b && b+c>a)
		{
			if(a == b && a == c)
				System.out.println("tam giac deu");
			else
				if(a == b || a == c || b == c)
					System.out.println("tam giac can");
				else
					if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
						System.out.println("tam giac vuong");
					else
						System.out.println("tam giac thuong");
		}
		else
			System.out.println("khong phai la tam giac");
	}
}
