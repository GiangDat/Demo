import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
    public List<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    private List<SinhVien> danhSachSinhVien;
    private static final String FILE_PATH = "sinh_vien.csv";

    public QuanLySinhVien() {
        danhSachSinhVien = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);
    }

    public void suaSinhVien(String maSV, SinhVien sinhVien) {
        int index = timViTriSinhVien(maSV);
        if (index != -1) {
            danhSachSinhVien.set(index, sinhVien);
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + maSV);
        }
    }

    public void xoaSinhVien(String maSV) {
        int index = timViTriSinhVien(maSV);
        if (index != -1) {
            danhSachSinhVien.remove(index);
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + maSV);
        }
    }

    public void hienThiDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }
    }

    private int timViTriSinhVien(String maSV) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMaSV().equals(maSV)) {
                return i;
            }
        }
        return -1;
    }

    public void ghiFileCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (SinhVien sinhVien : danhSachSinhVien) {
                writer.println(sinhVien.getMaSV() + "," +
                        sinhVien.getHoTen() + "," +
                        sinhVien.getTuoi() + "," +
                        sinhVien.getGioiTinh() + "," +
                        sinhVien.getDiaChi() + "," +
                        sinhVien.getDiemTrungBinh());
            }
            System.out.println("Đã ghi thông tin sinh viên vào file CSV.");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void docFileCSV() {
        danhSachSinhVien.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    String maSV = data[0];
                    String hoTen = data[1];
                    int tuoi = Integer.parseInt(data[2]);
                    String gioiTinh = data[3];
                    String diaChi = data[4];
                    double diemTrungBinh = Double.parseDouble(data[5]);
                    SinhVien sinhVien = new SinhVien(maSV, hoTen, tuoi, gioiTinh, diaChi, diemTrungBinh);
                    danhSachSinhVien.add(sinhVien);
                }
            }
            System.out.println("Đã đọc thông tin sinh viên từ file CSV.");
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại.");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}