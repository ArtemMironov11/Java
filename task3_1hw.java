package HW1;
/* Реализовать простой калькулятор */ 
import java.util.Scanner;


class Main 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner i_Scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int f_Num = i_Scanner.nextInt();
        System.out.print("Введите второе число: ");
        int s_Num = i_Scanner.nextInt();
        System.out.print("Введите знак (+*-/): ");
        String arith_oper = i_Scanner.next();
        i_Scanner.close();
        switch (arith_oper) 
        {
            case "/": 
            {
                if (s_Num != 0) 
                {
                    System.out.println(f_Num / s_Num);
                } else 
                {
                    System.out.println("Деление на ноль невозможно!");
                }
            }
        } switch (arith_oper) {
            case "*": System.out.println(f_Num * s_Num);
        } switch (arith_oper) {
            case "-": System.out.println(f_Num - s_Num);
        } switch (arith_oper) {
            case "+": System.out.println(f_Num + s_Num);
        }
    }
}

