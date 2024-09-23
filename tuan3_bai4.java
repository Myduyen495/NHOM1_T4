import java.util.Scanner;

public class tuan3_bai4 {
	public static void main(String[] args) {
		int a , b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap cac so a, b, c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		System.out.println("so nho nhat trong ba so: "+min);
	}
}
