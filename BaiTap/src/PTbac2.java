import java.util.Scanner;

public class PTbac2 {
    public static void main(String[] args) {
        System.out.println("Phuong trinh bac nhat");
        System.out.println("a*x+b=c");
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap a: ");
        a = sc.nextFloat();

        System.out.println("nhap b: ");
        b = sc.nextFloat();

        System.out.println("nhap c: ");
        c = sc.nextFloat();
        if (a != 0) {
            double ans = (c - b) / a;
            System.out.println("Nghiem cu pt la:" + ans);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }}