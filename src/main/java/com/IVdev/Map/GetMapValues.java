package com.IVdev.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetMapValues {
    public static void main(String[] args) {
        //Все пары (ключ-значение) хранятся во внутреннем интерфейсе Map.Entry, а чтобы получить их, нужно вызвать метод entrySet().
        Map<String, Integer> map = new HashMap<>();

        map.put("David", 24);
        map.put("John", 35);
        map.put("Jane", 19);
        map.put("Billy", 21);

        System.out.println("Пройтись по каждой записи Map.Entry<K,V> в наборе записей и извлекая ключ и значение");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(String.format("Key (name) is: %s, Value (age) is: %s", pair.getKey(), pair.getValue()));
        }

        System.out.println("Использовать каждый ключ и значение с map =================================");
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("Использовать целые записи из набора =================================");
        map.entrySet()
                .forEach((entry) -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        System.out.println("Получить только ключи =================================");
        for(String key: map.keySet()){
            System.out.println(key);
        }

        System.out.println("Получить только значения =================================");
        for(int value: map.values()){
            System.out.println(value);
        }

        System.out.println("Проверить наличие ключа =================================");
        System.out.println(map.containsKey("John"));

        System.out.println("Проверить наличие значения =================================");
        System.out.println(map.containsKey("John"));
    }
}
