import java.util.Scanner;
import java.util.logging.Logger;

public class Slide34 {
    private static final Logger LOGGER = Logger.getLogger(Slide34.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LOGGER.info("Giải phương trình bậc 2 ax^2 + bx + c = 0");

        System.out.print("Nhập vào hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập vào hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập vào hệ số c: ");
        double c = scanner.nextDouble();

        scanner.close();

        double delta = b * b - 4 * a * c;
        double x1, x2;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            LOGGER.info("Phương trình có 2 nghiệm phân biệt:");
            LOGGER.info("x1 = " + x1);
            LOGGER.info("x2 = " + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            LOGGER.info("Phương trình có nghiệm kép:");
            LOGGER.info("x = " + x1);
        } else {
            LOGGER.info("Phương trình vô nghiệm.");
        }
    }
}