import java.util.Scanner;

public class tuan3_bai2 {
	public static void main(String[] args) {
		float dtb;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap diem trung binh: ");
		dtb = sc.nextFloat();
		if(dtb >= 8)
			System.out.println("xep loai: gioi");
		else
			if(dtb >=6.5)
				System.out.println("xep loai: kha");
			else
				if(dtb >= 4)
					System.out.println("xep loai: trung binh");
				else
					System.out.println("xep loai: yeu");
	}
}
