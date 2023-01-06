package HW5;

import java.util.*;

public class Task1_5hw {
    public static void main(String[] args) {
        Map<String, String> PhBook = new HashMap<>();
        PhBook.putIfAbsent("Иванов", "100");
        PhBook.put("Петров", "200");
        PhBook.put("Сидоров", "300");
        PhBook.put("Егоров", "400, 500");
        PhBook.put("Ефремов", "600, 700");
        PhBook.put("Миронов", "800, 850");
        PhBook.put("Болтунов", "900, 1000");
        PhBook.put("Любимов", "2000");
        PhBook.put("Злобин", "2050");
        PhBook.put("Сифонов", "1100, 1400");
        PhBook.put("Салютов", "1450, 1500");
        PhBook.put("Тышкевич", "1550, 1650");
        PhBook.put("Джубаба", "1700, 1850");
        System.out.println(PhBook);
        System.out.println();

        PhBook.put("Бублик", "4500");
        System.out.println(PhBook);
        System.out.println();

        PhBook.remove("Иванов");
        System.out.println(PhBook);
    }
}
