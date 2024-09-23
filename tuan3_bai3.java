import java.util.Scanner;

public class tuan3_bai3 {
	public static void main(String[] args) {
		int a, b, c;
		float delta, x1, x2;
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap a, b, c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a == 0)
			if(b == 0)
				if(c == 0)
					System.out.println("phuong trinh co vo so nghiem !");
				else
					System.out.println("phuon trinh vo nghiem !");
			else
			{
				x1 = (float) -c/b;
				System.out.println("phuong trinh co nghiem x = "+x1);
			}
		else
		{
			delta = b*b - 4*a*c;
			if(delta > 0)
			{
				x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
				x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
				System.out.println("phuon trinh co 2 no x1 = "+ x1 + " x2 = "+ x2);
			}
			else
				if(delta == 0)
					x1 = (float)-b/(2*a);
				else
					System.out.println("phuong trinh vo nghiem !");
		}
		
	}
}
