package ua.hillel.yatsenko.lessons.lesson9;

import java.util.Scanner;

public class HomeWork
{
    static int GetNextInt(Scanner sc)
    {
        int value;
        while (!sc.hasNextInt())
        {
            System.out.println("Введіть ціле число!");
            sc.nextLine();
            System.out.print(": ");
        }
        value = sc.nextInt();
        sc.nextLine();
        return value;
    }
    public static void main(String[] args)
    {
        int minValue = 1;
        int maxValue = 100;

        Scanner sc = new Scanner(System.in);
        int m, n;

        System.out.print("Введіть M: ");
        m = GetNextInt(sc);
        System.out.print("Введіть N: ");
        n = GetNextInt(sc);

        int[][] matrix1 = new int[m][n];
        for (int i=0; i<matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[i].length; j++)
            {
                matrix1[i][j] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
            }
        }

        int[][] matrix2 = new int[n][m];

        for (int i=0; i<matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[i].length; j++)
            {
                matrix2[j][i] = matrix1[i][j];
            }
        }

        System.out.println("Матриця 1:");
        for (int[] row : matrix1)
        {
            for (int value : row)
            {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        System.out.println("Матриця 2:");
        for (int[] row : matrix2)
        {
            for (int value : row)
            {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
