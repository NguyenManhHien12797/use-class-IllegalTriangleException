import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("Đây là 3 cạnh của tam giác"); ;
            } else throw new Exception("Lỗi tổng 2 cạnh không lơn hơn cạnh còn lại");
        } else throw new Exception("Lỗi cạnh có độ dài không lớn hơn 0");

    }

}
