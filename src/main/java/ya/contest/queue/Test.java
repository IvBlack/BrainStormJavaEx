package ya.contest.queue;

public class Test {
    public static void main(String[] args) {
        String str = "[put, 5]";
        int start = str.lastIndexOf(",") + 2;
        int end = str.length() - 1;

        try {
            int number = Integer.parseInt(str.substring(start, end));
            System.out.println("Извлеченное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось преобразовать в число");
        }
    }
}
