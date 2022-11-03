import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task {
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("Ivan", 10);
        map.put("Semen", 30);
        map.put("Natalia", 129);
        System.out.println(map);
        Task task = new Task();
        task.addInCollection("Iv", 20);
        System.out.println(map);
        task.addInCollection("Natalia", 30);
        System.out.println(map);


    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void addInCollection(String name, Integer salary) {
        if (name == null || name.isEmpty() || name.isBlank() || salary <= 0) {
            throw new IllegalArgumentException("Некорректный ввод");
        }
        if (!map.containsKey(name)) {
            map.put(name, salary);
        } else {
            boolean result = Objects.equals(map.get(name), salary);
            if (result){
                throw new IllegalArgumentException("Такое значение уже есть");
            }else {
                map.put(name, salary);
            }
        }
    }
}