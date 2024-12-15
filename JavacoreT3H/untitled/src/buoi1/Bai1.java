package buoi1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Tạo ra 1 đối tượng scanner bằng từ khóa new
        Scanner scanner = new Scanner(System.in);
        //dùng đối tượng scanner cho tất cả lần nhập vào
        System.out.println("Nhập họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhâp ngày sinh: ");
        int ngaySinh = scanner.nextInt();
        System.out.println("Nhâp tháng sinh: ");
        int thangSinh = scanner.nextInt();
        System.out.println("Nhâp năm sinh: ");
        int namSinh = scanner.nextInt();
        scanner.nextLine(); //xử lý kí tự xuống dòng còn lại
        //Thêm scanner.nextLine() sau mỗi lần đọc số nguyên:
        //
        //scanner.nextInt() không tiêu thụ ký tự xuống dòng, \
        //do đó cần thêm scanner.nextLine() sau khi đọc xong số nguyên để đảm bảo lần gọi nextLine() tiếp theo hoạt động bình thường.
        System.out.println("Nhâp quê quán: ");
        String queQuan = scanner.nextLine();
        System.out.println("Nhâp tên trường: ");
        String tenTruong = scanner.nextLine();
        System.out.println("Họ và tên: " + name +" đến từ " + queQuan +", sinh ngày " + ngaySinh + "/"+ thangSinh + "/"+ namSinh + ", học tại trường "+tenTruong);
    }
}
