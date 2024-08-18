package com.IVdev.streamex;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
public class SortByLexico {

    //в алфа порядке
    private static List<String> INPUT_ORDER = Arrays.asList("mike", "usmon", "john", "ken", "harry");
    private static List<String> EXPECTED_NATURAL_ORDER = Arrays.asList("harry", "john", "ken", "mike", "usmon");

    public static void main(String[] args) {
        sortList();
    }

    public static void sortList() {
        System.out.println(INPUT_ORDER.stream()
                .sorted()
                .toList()
        );
    }

//    @Test
//    public void givenListOfStrings_whenUsingCollections_thenListIsSorted() {
//        Collections.sort(INPUT_ORDER);
//        assertThat(INPUT_ORDER).isEqualTo(EXPECTED_NATURAL_ORDER);
//    }
}
