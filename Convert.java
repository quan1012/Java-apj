import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiền: ");
        double VND = 23000;
        double USD = scanner.nextDouble();
        double quydoi = USD *23000;
        System.out.println("Gia tri VND là :" + quydoi);
    }
}
