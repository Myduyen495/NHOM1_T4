import java.util.Scanner;
public class b6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao so thu nhat ");
        double so1 = sc.nextDouble();
        System.out.print("nhap vao so thu 2 ");
        double so2 = sc.nextDouble();
        
        System.out.println("Chon phep tinh: ");
        System.out.println("1.Cong ");
        System.out.println("2.Tru ");
        System.out.println("3.Nhan ");
        System.out.println("4.Chia ");
        
        System.out.println("nhap vao su lua chon 1-4 ");
        int luachon = sc.nextInt();
        double kq=0;//bien de luu kqua
        
        switch(luachon){
            case 1:
                kq = so1+so2;
                System.out.println("ket qua: " +so1+ "+" +so2+ "=" +kq);
                break;
            case 2:
                kq = so1-so2;
                System.out.println("ket qua: " +so1+ "-" +so2+ "=" +kq );
                break;
            case 3:
                kq = so1*so2;
                System.out.println("ket qua: " +so1+ "*" +so2+ "=" +kq );
                break;
            case 4:
                if (so2 != 0) 
                {
                    kq = so1/ so2;
                    System.out.println("Ket qua: " + so1 + " / " + so2 + " = " +kq);
                } else 
                    System.out.println("Loi: khong the chia cho 0");
                break;
            default:
                System.out.println("Lua chon khong hop le");
                break;
        }
    }
}
