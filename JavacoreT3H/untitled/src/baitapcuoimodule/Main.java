package baitapcuoimodule;
import java.util.*;

public class Main {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentManager manager = new StudentManager();

    while (true) {
        System.out.println("\nMenu Quản Lý Danh Sách Sinh Viên");
        System.out.println("1. Thêm sinh viên vào danh sách");
        System.out.println("2. Sửa thông tin sinh viên");
        System.out.println("3. Xóa sinh viên khỏi danh sách");
        System.out.println("4. Tìm kiếm sinh viên theo tên");
        System.out.println("5. Hiển thị danh sách sinh viên");
        System.out.println("6. Thoát");
        System.out.print("Chọn chức năng: ");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Nhập tên sinh viên: ");
                String name = sc.nextLine();
                System.out.print("Nhập tuổi sinh viên: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập mã sinh viên: ");
                String id = sc.nextLine();
                manager.themSinhVien(new Student(name, age, id));
                break;
            case 2:
                System.out.print("Nhập mã sinh viên cần chỉnh sửa: ");
                String editId = sc.nextLine();
                manager.suaThongTinSinhVien(editId);
                break;
            case 3:
                System.out.print("Nhập mã sinh viên cần xóa: ");
                String deleteId = sc.nextLine();
                manager.xoaSinhVien(deleteId);
                break;
            case 4:
                System.out.print("Nhập tên sinh viên cần tìm: ");
                String searchName = sc.nextLine();
                manager.timKiemTheoTen(searchName);
                break;
            case 5:
                manager.hienThiDanhSach();
                break;
            case 6:
                System.out.println("Đã thoát khỏi chương trình.");
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
        }
    }
}
}
