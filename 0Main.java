public class Main {
    public static String concatStrings(String c1, String c2){
        return c1.concat(c2);
    }
    public static void main(String[] args) {
        // проверка на Null Pointer Exception
        String s1 = null;
        System.out.println(s1 == null ? 0 : s1.length());

        // переложение тернарного оператора на if - else
        /*if (s1 == null) {
            0;
        }else {
            s1.length();
        }*/

        // сравнение строк вызывает NPE
        String s2 = null;
        /*if (s2.equals("abc")) {
            System.out.println("\nОдинаковы");
        }*/

        // избегаем NPE
        if ("abc".equals(s2)) {
            System.out.println("\nОдинаковы");
        }

        // что если два переменных оба String и мы не знаем
        String c1 = null;
        String c2 = null;
        if (java.util.Objects.equals(c1,c2)) {
            System.out.println("\nСтроки одинаковы");
        }
        // Правила для избегания NPE
        // 1. Для ссылочных типов используем условие для проверки
        // переменной - не равна ли она null
        // 2. Стараемся избежать присвоения / назначения null для
        // инициализации переменной где бы то ни было.
        // 3. Использовать NPE-безопасные методы из стандартной библиотеки.

    }
}
