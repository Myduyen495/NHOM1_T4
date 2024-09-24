//6.Viết chương trình thực hiện các phép tính cơ bản (cộng, trừ, nhân, chia) dựa trên lựa chọn của người dùng.

import java.util.Scanner;

public class tuan3_bai6 {
	public static void main(String[] args) {
		float a, b, kq;
		char phepTinh;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a, b: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		System.out.println("chon phep tinh (+, - ,* , /):  ");
		phepTinh = sc.next().charAt(0);
		switch (phepTinh) {
		case '+' :
			kq = a+b;
			System.out.println(a + " + " +b + " = "+kq);
			break;
		case '-' :
			kq = a-b;
			System.out.println(a + " - " +b + " = "+kq);
			break;
		case '*' :
			kq = a*b;
			System.out.println(a + " * " +b + " = "+kq);
			break;
		case '/' :
			kq = a/b;
			if(b == 0)
				System.out.println("loi !, gia tri b phai khac 0! ");
			else
			System.out.println(a + " / " +b + " = "+kq);
			break;
		default:
			System.out.println("phep tinh khong hop le");
		}
	}
}
