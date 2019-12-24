package TinhLuongNV;

public class NhanVienPartTime extends NhanVien {
    //Giờ làm việc của nhân viên partTime
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhân viên thời vụ";
    }

    @Override
    public void tinhLuong() {
        luong = Configs.LUONG_LAM_THEM_MOI_GIO * gioLamViec;
    }
}
