//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*int num1=30;
int num2=70;
int sum = new Main().getsum(num1, num2);
        System.out.println(sum);
    }
    public int getsum(int a,int b){
        int sum;
        sum= a+b;
        return sum;*/

   /* String mes= shownoti("Hello");
        System.out.println(mes);

    }
    private static String shownoti(String noti){
        return noti;*/


        int i = 4;
        int j = 6;
        int k = max(i, j);
        System.out.println("Số lớn nhất giữa 2 số " + i + " và " + j + " là số : " + k);
    }

    public static int max(int num1, int num2) {
        int ans;
if (num1>num2)
    ans = num1;
else
    ans=num2;
return ans;

    }
}