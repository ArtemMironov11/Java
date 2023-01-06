package HW4;

import java.util.*;

public class Task3_4hw {
    public static void main(String[] args) {
        LinkedList<Integer> actions = new LinkedList<Integer>();
        Calculator(actions);
    }

    /**
     * @param actions
     */
    public static void Calculator(LinkedList<Integer> actions) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int fNum = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int sNum = iScanner.nextInt();
        System.out.print("Введите знак (+*-/): ");
        String arithOper = iScanner.next();
        iScanner.close();
        StringBuilder result = new StringBuilder();
        int res = 0;

        switch (arithOper) {
            case "/": {
                if (sNum != 0) {
                    res = fNum / sNum;
                    System.out.println(fNum / sNum);
                    result.append(fNum).append(arithOper).append(sNum).append("=").append(res);
                } else {
                    System.out.println("Деление на ноль невозможно!");
                }
            }
        }
        switch (arithOper) {
            case "*":
                res = fNum * sNum;
                System.out.println(fNum * sNum);
                result.append(fNum).append(arithOper).append(sNum).append("=").append(res);
        }
        switch (arithOper) {
            case "-":
                res = fNum - sNum;
                System.out.println(fNum - sNum);
                result.append(fNum).append(arithOper).append(sNum).append("=").append(res);
        }
        switch (arithOper) {
            case "+":
                res = fNum + sNum;
                System.out.println(fNum + sNum);
                result.append(fNum).append(arithOper).append(sNum).append("=").append(res);
        }
        switch (arithOper) {
            case "undo":
                actions.removeLast();
                System.out.println("Последнее действие отменено");
        }
        actions.add(res);
    }
}
