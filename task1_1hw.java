package HW1;

/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
n! (произведение чисел от 1 до n) */


import java.util.Scanner;

public class task1_1hw 
{
    public static void main(String[] args) 
    {
        Scanner i_Scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = i_Scanner.nextInt();
        i_Scanner.close();

        int n_Number = number * (number + 1) / 2;
        System.out.printf("Произведение чисел от 1 до n равно %d", n_Number);
    }
}