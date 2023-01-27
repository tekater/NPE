import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static String toUpperCase(String str) {
        return (str == null ? "0" : str.toUpperCase(Locale.ENGLISH));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Line");
        String line = scanner.nextLine();
        //line = "none".equalsIgnoreCase(line) ? null : line;
        //System.out.println(line == null ? 0 : " ");
        System.out.println(toUpperCase(line));
    }
}
