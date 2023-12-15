package ua.hillel.yatsenko.lessons.lesson7;

import java.util.Arrays;

public class Homework
{
    public static void main(String[] args)
    {
        int playersAmount = 25;

        int[] firstTeamAges = new int[playersAmount];
        int[] secondTeamAges = new int[playersAmount];

        double firstTeamAverageAge = 0;
        double secondTeamAverageAge = 0;

        for (int i = 0; i < playersAmount; i++)
        {
            firstTeamAges[i] = (int) (Math.random() * 23 + 18);
            secondTeamAges[i] = (int) (Math.random() * 23 + 18);

            firstTeamAverageAge += firstTeamAges[i];
            secondTeamAverageAge += secondTeamAges[i];
        }

        System.out.println("Вік гравців першої команди:\n" + Arrays.toString(firstTeamAges));
        System.out.println("Вік гравців другої команди:\n" + Arrays.toString(secondTeamAges));

        System.out.println();
        firstTeamAverageAge /= playersAmount;
        secondTeamAverageAge /= playersAmount;

        System.out.println("Середній вік гравців першої команди: " + firstTeamAverageAge);
        System.out.println("Середній вік гравців другої команди: " + secondTeamAverageAge);
    }
}
