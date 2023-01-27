import java.util.Scanner;

public class Main {
    public static String concatStrings(String s1, String s2) {
        if (s1 != null & s2 != null) {
            return (s1 + s2);
            //return s1.concat(s2);
        } else if (s1 != null & s2 == null) {
            return (s1);
        } else if (s1 == null & s2 != null) {
            return (s2);
        } else if (s1 == null & s2 == null) {
            return ("");
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите s1");
        String s1 = scanner.nextLine();
        System.out.println("Введите s2");
        String s2 = scanner.nextLine();
        System.out.println("Наше слово:");
        System.out.println(concatStrings(s1, s2));

    }
}
