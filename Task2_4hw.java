package HW4;
import java.util.*;
public class Task2_4hw {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        LinkedList<Integer> FinalList = new LinkedList<Integer>();

        for (Integer zztemp : list) {
            FinalList.add(zztemp);
        }
        System.out.println(FinalList);

        enqueue(FinalList, 42);
        System.out.println(FinalList);

        System.out.print(dequeue(FinalList) + " ");
        System.out.println(FinalList);

        System.out.print(first(FinalList) + " ");
        System.out.println(FinalList);
    }

    public static void enqueue(LinkedList<Integer> list, int Number) {
        list.addLast(Number);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int Number = 0;
        Number = list.get(0);
        list.remove(0);
        return Number;
    }

    public static int first(LinkedList<Integer> list) {
        int Number = 0;
        Number = list.get(0);
        return Number;
    }
}
