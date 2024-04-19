import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Định nghĩa lớp sản phẩm
class Product {
    private int id;
    private String name;
    private double price;

    // Constructor để khởi tạo sản phẩm
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Phương thức getter để lấy id
    public int getId() {
        return id;
    }

    // Phương thức setter để đặt id
    public void setId(int id) {
        this.id = id;
    }

    // Phương thức getter để lấy tên
    public String getName() {
        return name;
    }

    // Phương thức setter để đặt tên
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức getter để lấy giá
    public double getPrice() {
        return price;
    }

    // Phương thức setter để đặt giá
    public void setPrice(double price) {
        this.price = price;
    }

    // Phương thức để hiển thị thông tin sản phẩm
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
