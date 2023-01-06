package HW5;

import java.util.*;

public class Task2_5hw {
    public static void main(String[] args) {
        ArrayList<String> emplList = new ArrayList<>();
        emplList.add("Cветлана");
        emplList.add("Кристина");
        emplList.add("Анна");
        emplList.add("Анна");
        emplList.add("Иван");
        emplList.add("Петр");
        emplList.add("Павел");
        emplList.add("Петр");
        emplList.add("Мария");
        emplList.add("Марина");
        emplList.add("Мария");
        emplList.add("Мария");
        emplList.add("Марина");
        emplList.add("Анна");
        emplList.add("Иван");
        emplList.add("Петр");
        emplList.add("Иван");

        Map<String, Integer> map = countsWords(emplList);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static HashMap<String, Integer> countsWords(ArrayList<String> empls) {
        HashMap<String, Integer> Unique = new HashMap<>();
        for (String Name : empls) {
            if (Unique.containsKey(Name)) {
                Unique.replace(Name, Unique.get(Name) + 1);
            } else {
                Unique.put(Name, 1);
            }
        }
        return Unique;
    }
}
