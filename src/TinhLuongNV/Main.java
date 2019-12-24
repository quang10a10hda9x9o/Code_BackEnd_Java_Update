package TinhLuongNV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nhập có nhân viên trong cty
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        int tongNhanVien = Integer.parseInt(input.nextLine());

        //Khai báo mảng các nhân viên
        NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
        for(int i=0 ; i<tongNhanVien ; i++) {
            //Khai báo từng nhân viên
            System.out.println("Nhập vào nhân viên thứ " + (i+1) +" là: ");
            String ten = input.nextLine();
            System.out.println("Loại nhân viên(1: FullTime, 2:PartTime): ");
            int laNhanVien = Integer.parseInt(input.nextLine());
            if(laNhanVien == 1) {
                System.out.println("Chức vụ(1: Sếp, 2:Lính): ");
                int chucVu = Integer.parseInt(input.nextLine());
                System.out.println("Ngày làm thêm nếu có: ");
                int ngayLamThem = Integer.parseInt(input.nextLine());
                mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
            } else {
                System.out.println("Giờ làm việc: ");
                int gioLamViec = Integer.parseInt(input.nextLine());
                mangNhanVien[i] = new NhanVienPartTime(ten,gioLamViec);
            }
        }
        System.out.println("_____________KẾT QUẢ TÍNH LƯƠNG_____________");
        for (NhanVien nhanVien : mangNhanVien) {
            nhanVien.tinhLuong();
            nhanVien.xuatThongTin();
        }
    }
}