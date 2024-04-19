public class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private double diemTrungBinh;

    public SinhVien(String maSV, String hoTen, int tuoi, String gioiTinh, String diaChi, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Các phương thức getter và setter

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "Mã SV: " + maSV +
                ", Họ tên: " + hoTen +
                ", Tuổi: " + tuoi +
                ", Giới tính: " + gioiTinh +
                ", Địa chỉ: " + diaChi +
                ", Điểm trung bình: " + diemTrungBinh;
    }
}
