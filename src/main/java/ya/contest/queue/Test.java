package ya.contest.queue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Тестовый класс, для обката сниппетов.
public class Test {
    public static void main(String[] args) {
//        String str = "[put, 5]";
//        int start = str.lastIndexOf(",") + 2;
//        int end = str.length() - 1;
//
//        try {
//            int number = Integer.parseInt(str.substring(start, end));
//            System.out.println("Извлеченное число: " + number);
//        } catch (NumberFormatException e) {
//            System.out.println("Не удалось преобразовать в число");
//        }


        String input = "[put -34]";

        // Шаблон для поиска числа с учетом знака
        Pattern pattern = Pattern.compile("\\[put\\s+(-?\\d+)\\]");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            try {
                int number = Integer.parseInt(matcher.group(1));
                System.out.println("Извлеченное число: " + number);
            } catch (NumberFormatException e) {
                System.err.println("Ошибка при преобразовании числа");
            }
        } else {
            System.err.println("Число не найдено в строке");
        }

//        String input = "[put 80]";

        // Шаблон для поиска числа с учетом знака
//        Pattern pattern = Pattern.compile("\\D+(-?\\d+)");
//        Matcher matcher = pattern.matcher(input);
//
//        if (matcher.find()) {
//            // Получаем число и берем его модуль
//            int number = Math.abs(Integer.parseInt(matcher.group(1)));
//            System.out.println("Извлеченное число по модулю: " + number);
//        }
    }
}
