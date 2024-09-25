import java.util.Scanner;
public class b5 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao canh a");
        double a=sc.nextDouble();
        System.out.print("nhap vao canh b");
        double b=sc.nextDouble();
        System.out.print("nhap vao canh c");
        double c=sc.nextDouble();
        
        if(a+b>c && a+c>b && b+c>a)
        {
            System.out.println("ba canh nay tao thanh mot tam giac");
            if(a==b && b==c)
                System.out.println("Day la tam giac deu");
            else if(a==b || b==c || a==c)
                System.out.println("Day la tam giac can");
            else if(a*a== b*b + c*c || b*b== a*a + c*c || c*c== a*a + b*b)
                System.out.println("Day la tam giac vuong");
            else
                System.out.println("Day la tam giac thuong");
        }
        else
            System.out.println("ba canh nay khong tao thanh mot tam giac"); 
    }
}

