package ua.hillel.yatsenko.lessons.lesson5;

import java.util.Scanner;

public class HomeWork
{
    static void showErrorMessage()
    {
        System.out.println("Помилка! Введіть ціле число.");
        System.exit(0);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String team1, team2;
        System.out.print("Введіть ім'я першої команди: ");
        team1 = sc.nextLine();
        System.out.print("Введіть ім'я другої команди: ");
        team2 = sc.nextLine();

        int team1_frags_1=0, team1_frags_2=0, team1_frags_3=0, team1_frags_4=0, team1_frags_5=0;
        int team2_frags_1=0, team2_frags_2=0, team2_frags_3=0, team2_frags_4=0, team2_frags_5=0;

        System.out.println("Фраги \"" + team1 + "\":");

        System.out.println("Перший гравець: ");
        if (sc.hasNextInt()) team1_frags_1 = sc.nextInt();
        else showErrorMessage();

        System.out.println("Другий гравець: ");
        if (sc.hasNextInt()) team1_frags_2 = sc.nextInt();
        else showErrorMessage();

        System.out.println("Третій гравець: ");
        if (sc.hasNextInt()) team1_frags_3 = sc.nextInt();
        else showErrorMessage();

        System.out.println("Четвертий гравець: ");
        if (sc.hasNextInt()) team1_frags_4 = sc.nextInt();
        else showErrorMessage();

        System.out.println("П'ятий гравець: ");
        if (sc.hasNextInt()) team1_frags_5 = sc.nextInt();
        else showErrorMessage();

        System.out.println("Фраги \"" + team2 + "\":");

        System.out.println("Перший гравець: ");
        if (sc.hasNextInt()) team2_frags_1 = sc.nextInt();
        else showErrorMessage();

        System.out.println("Другий гравець: ");
        if (sc.hasNextInt()) team2_frags_2 = sc.nextInt();
        else showErrorMessage();

        System.out.println("Третій гравець: ");
        if (sc.hasNextInt()) team2_frags_3 = sc.nextInt();
        else showErrorMessage();

        System.out.println("Четвертий гравець: ");
        if (sc.hasNextInt()) team2_frags_4 = sc.nextInt();
        else showErrorMessage();

        System.out.println("П'ятий гравець: ");
        if (sc.hasNextInt()) team2_frags_5 = sc.nextInt();
        else showErrorMessage();


        int team1_total = team1_frags_1 + team1_frags_2 + team1_frags_3 + team1_frags_4 + team1_frags_5;
        int team2_total = team2_frags_1 + team2_frags_2 + team2_frags_3 + team2_frags_4 + team2_frags_5;

        double team1_avg = team1_total/5.0;
        double team2_avg = team2_total/5.0;

        String team_winner;
        int result;

        if (team1_avg == team2_avg)
        {
            System.out.println("Нічия");
            return;
        }

        if (team1_avg > team2_avg)
        {
            team_winner = team1;
            result = team1_total;
        }
        else
        {
            team_winner = team2;
            result = team2_total;
        }

        System.out.println("Перемогла команда \"" + team_winner + "\". Кількість фрагів: " + result);
    }
}
