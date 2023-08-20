import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

//трансформировать строку, чтобы символы были уникальны и отсортированы
//по количеству повторений (от большего к меньшему)
public class SortDuplicateString {
    public static void main(String[] args) {
        System.out.println(getDescString("ndotabonbtnntnoobtno")); // notbad
    }

    private static String getDescString(String str) {
        return Arrays
                .stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());
    }
}