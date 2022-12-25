package HW1;

/*Вывести все простые числа от 1 до 1000 */

import java.util.Scanner;

public class task2_1hw
{
    public static void main(String[] args) 
    {
        Scanner i_Scanner = new Scanner(System.in);
        System.out.print("Введите  число от 1 до 1000: ");
        int number = i_Scanner.nextInt();
        i_Scanner.close();

        int i, j;
        for (i = 2; i < number; i++) 
        {
            int k = 0;
            for (j = 2; j <= i; j++) 
            {
                if ((i % j) == 0)
                    k++;
            }
            if (k < 2)
                System.out.println(i);
        }
    }
}
