import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều rộng");
        width = scanner.nextFloat();
        System.out.println("Chiều dài");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Diện tích= " + area);
    }
}
