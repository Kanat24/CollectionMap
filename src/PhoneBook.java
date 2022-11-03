import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        phoneBook.put("Иванов Иван", "+79234991391");
        phoneBook.put("Иванов Петр", "+79232291391");
        phoneBook.put("Иванов Сидор", "+79233391391");
        phoneBook.put("Петров Иван", "+79444991391");
        phoneBook.put("Петров Петр", "+79235591391");
        phoneBook.put("Смирнов Иван", "+79200991391");
        phoneBook.put("Кравцов Иван", "+79234991221");
        phoneBook.put("Стасов Иван", "+89234991391");
        phoneBook.put("Трофимов Иван", "+79234000391");
        phoneBook.put("Пантелейак Иван", "+79234995691");
        phoneBook.put("Рудаков Иван", "+79234996691");
        phoneBook.put("Титуленко Иван", "+7923323291391");
        phoneBook.put("Ибрагимов Ибрагим", "+792340001391");
        phoneBook.put("Московский Иван", "+792313291391");
        phoneBook.put("Краснов Александр", "+792344991391");
        phoneBook.put("Синютин Ангар", "+79234967791");
        phoneBook.put("Себенюк Наталья", "+79256791391");
        phoneBook.put("Коржун Раик", "+79234991555");
        phoneBook.put("Стрипсов Аркан", "+79123991391");
        phoneBook.put("Дронов Максим", "+79233391391");
        System.out.println(phoneBook);
    }



}
