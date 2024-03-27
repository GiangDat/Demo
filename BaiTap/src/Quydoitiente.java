import java.util.Scanner;

public class Quydoitiente {
   public static void main(String[] args) {
        double vnd =24000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn đổi bao nhiêu USD ra tiền VND: ");
        usd = sc.nextDouble();
        double ThanhTien =usd * 24000;
        System.out.println("Số tiền sau quy đổi của bạn là : "+ ThanhTien + "VND");
    }
}




