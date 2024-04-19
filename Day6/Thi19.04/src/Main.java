import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

        while (true) {
            System.out.println("----- Quản lý sinh viên -----");
            System.out.println("                                 ");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Ghi danh sách sinh viên vào file CSV");
            System.out.println("6. Đọc danh sách sinh viên từ file CSV");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ kí tự new line sau khi nhập lựa chọn

            switch (choice) {
                case 1:
                    quanLySinhVien.hienThiDanhSachSinhVien();
                    break;
                case 2:
                    System.out.println("Nhập mã sinh viên: ");
                    String maSV = scanner.nextLine();
                    System.out.println("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ kí tự new line sau khi nhập tuổi
                    System.out.println("Nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.println("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();
                    System.out.println("Nhập điểm trung bình: ");
                    double diemTrungBinh = scanner.nextDouble();
                    scanner.nextLine(); // Đọc bỏ kí tự new line sau khi nhập điểm trung bình
                    SinhVien sinhVien = new SinhVien(maSV, hoTen, tuoi, gioiTinh, diaChi, diemTrungBinh);
                    quanLySinhVien.themSinhVien(sinhVien);
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần cập nhật: ");
                    String maSVUpdate = scanner.nextLine();
                    SinhVien sinhVienUpdate = null;
                    for (SinhVien sv : quanLySinhVien.getDanhSachSinhVien()) {
                        if (sv.getMaSV().equals(maSVUpdate)) {
                            sinhVienUpdate = sv;
                            break;
                        }
                    }
                    if (sinhVienUpdate != null) {
                        System.out.println("Nhập họ tên mới: ");
                        sinhVienUpdate.setHoTen(scanner.nextLine());
                        System.out.println("Nhập tuổi mới: ");
                        sinhVienUpdate.setTuoi(scanner.nextInt());
                        scanner.nextLine(); // Đọc bỏ kí tự new line sau khi nhập tuổi mới
                        System.out.println("Nhập giới tính mới: ");
                        sinhVienUpdate.setGioiTinh(scanner.nextLine());
                        System.out.println("Nhập địa chỉ mới: ");
                        sinhVienUpdate.setDiaChi(scanner.nextLine());
                        System.out.println("Nhập điểm trung bình mới: ");
                        double diemTrungBinhMoi = scanner.nextDouble();
                        scanner.nextLine(); // Đọc bỏ kí tự new line sau khi nhập điểm trung bình mới
                        sinhVienUpdate.setDiemTrungBinh(diemTrungBinhMoi);
                        quanLySinhVien.suaSinhVien(maSVUpdate, sinhVienUpdate);
                    } else {
                        System.out.println("Không tìm thấy sinh viên có mã " + maSVUpdate);
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String maSVXoa = scanner.nextLine();
                    quanLySinhVien.xoaSinhVien(maSVXoa);
                    break;
                case 5:
                    quanLySinhVien.ghiFileCSV();
                    break;
                case 6:
                    quanLySinhVien.docFileCSV();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
