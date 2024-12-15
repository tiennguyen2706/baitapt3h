package buoi1;

import java.util.Scanner;

public class bai1_2 {
    public static void main(String[] args) {
        System.out.println("Nhập họ và tên: ");
        // mỗi dòng nhập sẽ khở tạo một đối tượng scanner bằng new scanner
        String name = new Scanner(System.in).nextLine();
        System.out.println("Nhâp ngày sinh: ");
        int ngaySinh = new Scanner(System.in).nextInt();
        System.out.println("Nhâp tháng sinh: ");
        int thangSinh = new Scanner(System.in).nextInt();
        System.out.println("Nhâp năm sinh: ");
        int namSinh = new Scanner(System.in).nextInt();
        System.out.println("Nhâp quê quán: ");
        String queQuan = new Scanner(System.in).nextLine();
        System.out.println("Nhâp tên trường: ");
        String tenTruong = new Scanner(System.in).nextLine();
        System.out.println("Họ và tên: " + name +" đến từ " + queQuan +", sinh ngày " + ngaySinh + "/"+ thangSinh + "/"+ namSinh + ", học tại trường "+tenTruong);
    }
}
