package HW2;
import java.util.ArrayList;

public class Task3_2hw {

    public static void main(String[] args) {
        String initialString = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}";
        jsonParse(initialString);
    }

    private static void jsonParse(String data) {
        String initial = data.substring(1, data.length() - 1);
        ArrayList<String> arrayList = new ArrayList<String>();

        String[] stringArr = initial.split(",");
        for (int i = 0; i < stringArr.length; i++) {
            String[] tempArr = stringArr[i].split(":");
            arrayList.add(tempArr[1].replace("\"", ""));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        StringBuilder phrase = new StringBuilder("Студент ");
        phrase.append(arrayList.get(0));
        phrase.append(" получил ");
        phrase.append(arrayList.get(1));
        phrase.append(" по предмету ");
        phrase.append(arrayList.get(2));

        System.out.println(phrase);
    }
}
