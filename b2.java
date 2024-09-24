/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package duyen.tuan3;

/**
 *
 * @author Mỹ Duyên
 */
import java.util.Scanner;
public class b2 {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao diem trung binh cua mot hoc sinh ");
        double dtb= sc.nextDouble();
        if(dtb>=8.5)
            System.out.println("Xep loai: Gioi");
        else if(dtb>=6.5)
            System.out.println("Xep loai: Kha");
        else if(dtb>=5.0)
            System.out.println("Xep loai: Trung binh");
        else 
            System.out.println("Xep loai: Yeu");
        
    }
            
}