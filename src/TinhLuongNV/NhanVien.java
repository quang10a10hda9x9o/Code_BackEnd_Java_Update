package TinhLuongNV;

public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    public String loaiNhanVien() {
        //Lớp con phải thực hiện để lo vụ này
        return "";
    }

    public void tinhLuong() {
        //Lớp con phải thực hiện để lo vụ này
    }

    public void xuatThongTin() {
        System.out.println("=====Nhân viên: " + ten + "=====");
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " NVD");
    }
}
