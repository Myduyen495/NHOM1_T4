import java.util.Scanner;

public class tuan3_bai1 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra: ");
		a = sc.nextInt();
		if(a > 0)
			System.out.println(a + " : so duong");
		else
			if(a == 0)
				System.out.println("day la so 0");
			else
				System.out.println(a + " : la so am");
		
	}
}
