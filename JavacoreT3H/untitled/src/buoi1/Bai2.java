package buoi1;

import java.util.Scanner;

public class Bai2 {
    /*
    Debug:
        kỹ năng theo dõi và quan sát chuơng trình chạy trên từng dòng code, và kiểm
        soát dữ liệu trên tuenfg dòng khi chương trình chạy qua
     */
    public static void main(String[] args) {
        System.out.println("Nhập vào 2 số a, b: ");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println("Tong a, b la: " + (a+b));
        System.out.println("Hieu a, b la: " + (a-b));
        System.out.println("Tich a, b la: " + (a*b));
        System.out.println("Thuong a, b la: " + (a/b));
        System.out.println("So du cua thuong a, b la: " + (a%b));
    }
}
