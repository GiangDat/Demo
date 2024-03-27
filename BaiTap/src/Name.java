import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên của bạn vào đây: ");
        String name = sc.nextLine();

        System.out.println("Xin chào bạn: " + name + " đã tới với khóa học của Codegym");
    }
}