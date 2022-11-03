package hw2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Task2 {
    private final Map<Integer, String> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        Task2 task2 =new Task2();
        task2.print();
    }

    public void print (){
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "i");
        map.put(17, "f");
        map.put(7, "g");
        map.put(8, "h");
        map.put(91, "i");
        map.put(100, "j");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
        System.out.println(integerStringEntry.getKey()+ " : "+ integerStringEntry.getValue());
        }
    }

}
