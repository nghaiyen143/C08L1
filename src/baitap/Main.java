package baitap;

import java.util.Scanner;

public class Main {
    public static void thucHienPhepTinh(){
        System.out.print("=====BUỔI 1 - THỰC HIỆN PHÉP TÍNH=====\n");
        int x=1,y=2,a=3,b=4,c=5;
        float result = ((3+4*x)/5) - ((10*(y-5)*(a+b+c))/x) + (9*((4/x)+((9+x)/y)));
        System.out.println("Kết quả phép tính = "+result);
    }
    public static int tinhDienTichHCN(int cd, int cr){
        System.out.print("=====BUỔI 2 - TÍNH DIỆN TÍCH HÌNH CHỮ NHẬT=====\n");
        int s = cd * cr;
        return s;
    }
    public static void giaiPTB1(){
        int a,b;
        float x;
        System.out.print("===== GIẢI PHƯƠNG TRÌNH BẬC NHẤT ax+b=0 =====\n");
        System.out.print("Nhập a: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.print("Nhập b: ");
        b = scanner.nextInt();
        if(a!=0){
            x=-b/a;
            System.out.print("Phương trình có nghiệm x = "+x);
        }
        else if(b==0){
            System.out.print("Phương trình luôn đúng với mọi x");
        }
        else{
            System.out.print("Phương trình vô nghiệm");
        }
    }
    public static void main(String[] args) {
        //thucHienPhepTinh();
        System.out.println("Diện tích HCN = "+tinhDienTichHCN(3,5));
        giaiPTB1();
    }
}
