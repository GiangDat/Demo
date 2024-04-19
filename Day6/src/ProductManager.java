import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    // Danh sách các sản phẩm được lưu trữ trong ArrayList
    private ArrayList<Product> products = new ArrayList<>();
    // Scanner để nhận input từ người dùng
    private Scanner scanner = new Scanner(System.in);

    // Phương thức để thêm sản phẩm mới
    public void addProduct() {
        System.out.println("Enter product id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product price:");
        double price = scanner.nextDouble();
        // Thêm sản phẩm mới vào danh sách
        products.add(new Product(id, name, price));

        System.out.println("Product added successfully!");
        displayProducts();
    }

    // Phương thức để sửa thông tin sản phẩm
    public void editProduct() {
        System.out.println("Enter product id to edit:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Enter new name:");
                String name = scanner.nextLine();
                System.out.println("Enter new price:");
                double price = scanner.nextDouble();
                // Cập nhật thông tin sản phẩm
                product.setName(name);
                product.setPrice(price);
                System.out.println("Product information updated successfully!");
                displayProducts();
                return;
            }
        }
        System.out.println("Product not found with id: " + id);
    }

    // Phương thức để xoá sản phẩm
    public void deleteProduct() {
        System.out.println("Enter product id to delete:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Product product : products) {
            if (product.getId() == id) {
                // Xoá sản phẩm từ danh sách
                products.remove(product);
                System.out.println("Product deleted successfully!");
                displayProducts();
                return;
            }
        }
        System.out.println("Product not found with id: " + id);
    }

    // Phương thức để hiển thị danh sách sản phẩm
    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
            displayProducts();
        }
    }

    // Phương thức để tìm kiếm sản phẩm theo tên
    public void searchProductByName() {
        System.out.println("Enter product name to search:");
        String name = scanner.nextLine();
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product not found with name: " + name);
            displayProducts();
        }
    }

    // Phương thức để sắp xếp sản phẩm theo giá tăng dần
    public void sortProductsByPriceAscending() {
        Collections.sort(products, Comparator.comparing(Product::getPrice));
        System.out.println("Products sorted by price (ascending):");
        displayProducts();
        return;
    }

    // Phương thức để sắp xếp sản phẩm theo giá giảm dần
    public void sortProductsByPriceDescending() {
        Collections.sort(products, Comparator.comparing(Product::getPrice).reversed());
        System.out.println("Products sorted by price (descending):");
        displayProducts();
    }
}