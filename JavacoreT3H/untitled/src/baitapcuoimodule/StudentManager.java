package baitapcuoimodule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void themSinhVien(Student student) {
        for (Student s : students) {
            if (s.getId().equals(student.getId())) {
                System.out.println("Mã sinh viên đã tồn tại, không thể thêm sinh viên.");
                return;
            }
        }
        students.add(student);
        System.out.println("Sinh viên đã được thêm vào danh sách.");
    }

    public void suaThongTinSinhVien(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Thông tin sinh viên hiện tại: " + student);
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập tên sinh viên chỉnh sửa: ");
                student.setName(sc.nextLine());
                System.out.print("Nhập tuổi sinh viên chỉnh sửa: ");
                student.setAge(sc.nextInt());
                sc.nextLine();
                System.out.print("Nhập mã sinh viên chỉnh sửa: ");
                student.setId(sc.nextLine());
                System.out.println("Thông tin sinh viên đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + id + ".");
    }

    public void xoaSinhVien(String id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId().equals(id)) {
                iterator.remove();
                System.out.println("Sinh viên đã được xóa khỏi danh sách.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + id + ".");
    }

    public void timKiemTheoTen(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Kết quả tìm kiếm: " + student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có tên " + name + ".");
        }
    }

    public void hienThiDanhSach() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
        } else {
            System.out.println("Danh sách sinh viên hiện tại:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
