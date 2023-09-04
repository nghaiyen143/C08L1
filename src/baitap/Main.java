package baitap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    //BUỔI 1:
    public static void thucHienPhepTinh(){
        System.out.print("=====BUỔI 1 - THỰC HIỆN PHÉP TÍNH=====\n");
        int x=1,y=2,a=3,b=4,c=5;
        float result = ((3+4*x)/5) - ((10*(y-5)*(a+b+c))/x) + (9*((4/x)+((9+x)/y)));
        System.out.println("Kết quả phép tính = "+result);
    }

    //BUỔI 2:
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
            System.out.println("Phương trình có nghiệm x = "+x);
        }
        else if(b==0){
            System.out.println("Phương trình luôn đúng với mọi x");
        }
        else{
            System.out.println("Phương trình vô nghiệm");
        }
    }

    // BUỔI 3:
    public static void bt1(){
        System.out.println("===== BT1 in ra số từ 1 đến 10 =====");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
    public static void bt2(){
        System.out.println("===== BT2 in ra các số chẵn chia hết cho 5 từ 1 đến 10 =====");
        for(int i=1; i<=10; i++){
            if(i%2==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
    public static void bt3(){
        System.out.println("===== BT3 Tính chỉ số BMI =====");
        float canNang,chieuCao,bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào cân nặng của bạn (kg): ");
        canNang = sc.nextFloat();
        while(canNang<=0){
            System.out.println("Cân nặng không hợp lệ. Vui lòng nhập lại cân nặng của bạn (kg): ");
            canNang = sc.nextFloat();
        }

        System.out.println("Vui lòng nhập vào chiều cao của bạn (kg): ");
        chieuCao = sc.nextFloat();
        while(chieuCao<=0){
            System.out.println("Chiều cao không hợp lệ. Vui lòng nhập lại chiều cao của bạn (m): ");
            chieuCao = sc.nextFloat();
        };

        bmi = canNang/(chieuCao*2);
        System.out.println("Chỉ số BMI của bạn là "+bmi);
        if(bmi<18.5){
            System.out.println("Bạn bị thiếu cân");
        }else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Bạn bình thường");
        }else if(bmi>=25 && bmi<=29.9){
            System.out.println("Bạn bị thừa cân");
        }else if(bmi>=30 && bmi<=34.9){
            System.out.println("Bạn bị béo phì độ I");
        }else if(bmi>=35){
            System.out.println("Bạn bị béo phì độ II trở lên");
        }
    }
    public static void bt4(){
        System.out.println("===== BT4 Tính giai thừa của 1 số nguyên =====");
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhập vào số nguyên dương n: ");
            n = sc.nextInt();
        }while (n<0);
        if(n==0){
            System.out.println(n+"!=1");
        }else{
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println(n+"!="+result);
        }
    }
    public static void bt5(){
        System.out.println("===== BT4 Tìm phần tử lớn nhất từ mảng được nhập vào =====");
        int[] a = new int[5];
        System.out.println("Nhập vào mảng gồm 5 phần tử");
        int x;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.println("a["+i+"]=");
            x= sc.nextInt();
            a[i]=x;
        }
        int max = a[0];
        ArrayList<Integer> indexMax = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                indexMax.clear();
                indexMax.add(i);
            }else if(a[i]==max){
                indexMax.add(i);
            }
        }
        System.out.print("Phần tử lớn nhất trong mảng bạn đã nhập vào là "+max+" ở vị trí: ");
        for(int index:indexMax){
            System.out.print("a["+index+"] ");
        }
    }
    public static void fibonacci(){
        System.out.println("===== BT6 In ra 20 số Fibonacci =====");
        int[] fibonacci = new int[20];
        fibonacci[0]=0;
        fibonacci[1]=1;
        int i=2;
        while (i<fibonacci.length){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            i++;
        }
        System.out.print("Dãy 20 số fibonacci là:");
        for(int f:fibonacci){
            System.out.print(" "+f);
        }
    }
    public static void main(String[] args) {
//        thucHienPhepTinh();
//        System.out.println("Diện tích HCN = "+tinhDienTichHCN(3,5));
//        giaiPTB1();
//
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1,"Yen");
//        map.put(2,"Chien");
//        System.out.println(map);

//        bt1();
//        bt2();
//        bt3();
//        bt4();
//        bt5();
        fibonacci();


    }
}
