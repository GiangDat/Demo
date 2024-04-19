import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Khai báo file để dữ liệu ghi vào file
    public static final String FILE_NAME = "Product.txt";
    // Đặt dấu phẩy tại mỗi bản ghi
    public static final String COMA = ",";

    public static void main(String[] args) {

//Bài Tập Lớp Stopwatch
//        StopWatch stopwatch = new StopWatch();
//        // Do some operation
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        stopwatch.stop();
//        long elapsedTime = stopwatch.getElapsedTime();
//        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");


//Bài tập Lớp hình tròn
//        Circle circle = new Circle(5, "xanh");
//        System.out.println(circle.toString());
//        Cylinder cylinder = new Cylinder(10, "Đỏ", 30);
//        System.out.println(cylinder.toString());


// Bài tập Lớp 2D-3D
//        Point2D point2D=new Point2D(2,5);
//        System.out.println(point2D.toString());
//        Point3D point3D=new Point3D(3,8,9);
//        System.out.println(point3D.toString());


// Bài tập lớp chuyển điểm
//        Point point = new Point();
//        point.setX(10);
//        point.setY(20);
//        System.out.println(point.getX()+"-"+point.getY());
//        System.out.println(point.getxy().toString());
//        System.out.println(Arrays.toString(point.getxy()));


// Bai tap lớp Point và  MovePoint
//        MoveablePoint moveablePoint = new MoveablePoint();
//        System.out.println("1:"+Arrays.toString(moveablePoint.getSpeed()));
//        System.out.println("2:"+moveablePoint.toString());
//        moveablePoint.move();
//        System.out.println("3:"+Arrays.toString(moveablePoint.getxy()));


//Bai tap ve san pham va them san pham
        /*ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu chức năng cho người dùng
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Search Product by Name");
            System.out.println("6. Sort Products by Price (Ascending)");
            System.out.println("7. Sort Products by Price (Descending)");
            System.out.println("8. Exit");
            System.out.println("Enter your choice:");

            // Đọc lựa chọn của người dùng
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Xử lý lựa chọn của người dùng
            switch (choice) {
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    manager.editProduct();
                    break;
                case 3:
                    manager.deleteProduct();
                    break;
                case 4:
                    manager.displayProducts();
                    break;
                case 5:
                    manager.searchProductByName();
                    break;
                case 6:
                    manager.sortProductsByPriceAscending();
                    break;
                case 7:
                    manager.sortProductsByPriceDescending();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        } while (choice != 8);

         */


      /*  Product product1 = new Product(1, "Samsung", 1200);
        Product product2 = new Product(1, "Apple", 26600);
        Product product3 = new Product(1, "Xiaomi", 8200);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        for (Product product : productList) {
            line = product.getId() + COMA + product.getName() + COMA + product.getPrice();

            //ghi file
            try {
                FileWriter fileWriter = new FileWriter(FILE_NAME, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

       */
        // đọc file
        String line = null;
        List<String> List = new ArrayList<>();
        try {
            FileReader fileRead = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileRead);
            line = null;
            while ((line = bufferedReader.readLine()) != null) {
                List.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(List);
    }
}