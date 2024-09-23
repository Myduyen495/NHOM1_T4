import java.util.Scanner;

public class bai2 {
	static Scanner sc;
	static double diemTB;
	
	static void Nhap() {
		sc=new Scanner(System.in);
		System.out.print("Nhập điểm trung bình của sinh viên = "); 
		diemTB=sc.nextDouble();
	}
	
	static void Xeploai() {
		if (diemTB>= 8.0) 
			System.out.print("Giỏi"); 
		else if (diemTB >= 6.5) 
			System.out.print("Khá");
		else if (diemTB >= 5.0) 
        	System.out.print("Trung bình");
            else 
            	System.out.print("Yếu");
	}
	
    public static void main(String[] args) {
    	Nhap();
    	Xeploai();
    }
}