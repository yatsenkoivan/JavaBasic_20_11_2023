package ua.hillel.yatsenko.lessons.lesson6;

import java.util.Scanner;

public class HomeWork1
{
    static int GetIntValue(Scanner sc)
    {
        int value;

        while (!sc.hasNextInt())
        {
            System.out.print("Введіть ціле число!\n: ");
            sc.nextLine();
        }

        value = sc.nextInt();
        sc.nextLine();

        return value;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int maxValue = 10;
        int minValue = 0;
        int totalAttempts;

        System.out.print("Введіть кількість спроб (мінімум 3)\n");
        do
        {
            System.out.print(": ");
            totalAttempts = GetIntValue(sc);
            if (totalAttempts >= 3)
            {
                break;
            }
            else
            {
                System.out.println("Кількість спроб повинна бути не менше 3!");
            }
        } while (true);


        int randomValue = (int) (Math.random() * (maxValue - minValue + 1) + minValue);

        System.out.println("Вгадайте число від " + minValue + " до " + maxValue + ".");
        boolean isGuessed = false;

        for (int currentAttempt = 0; currentAttempt < totalAttempts; currentAttempt++)
        {
            System.out.print("Спроба " + (currentAttempt+1) +  ": ");
            int userValue = GetIntValue(sc);

            if (userValue == randomValue)
            {
                System.out.println("Ви вгадали!");
                isGuessed = true;
                break;
            }
            else
            {
                System.out.println("Ви не вгадали.");
            }
        }

        if (!isGuessed)
        {
            System.out.println("Було загадано число " + randomValue + ".");
        }
    }
}
