package ua.hillel.yatsenko.lessons.lesson8;

import java.util.Arrays;

public class HomeWork
{
    static void SelectionSort(int[] array)
    {
        for (int i=0; i<array.length; i++)
        {
            int minValue = array[i];
            int minIndex = i;
            for (int j=i+1; j<array.length; j++)
            {
                if (array[j] < minValue)
                {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = minValue;
            array[minIndex] = temp;
        }
    }
    public static void main(String[] args)
    {
        int size=7;
        int minValue = 0;
        int maxValue = 9;

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        for (int i=0; i<size; i++)
        {
            array1[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
            array2[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        }

        System.out.println("Перед сортуванням");
        System.out.println("Масив 1:\t" + Arrays.toString(array1));
        System.out.println("Масив 2:\t" + Arrays.toString(array2));
        System.out.println();

        SelectionSort(array1);
        SelectionSort(array2);

        System.out.println("Після сортування");
        System.out.println("Масив 1:\t" + Arrays.toString(array1));
        System.out.println("Масив 2:\t" + Arrays.toString(array2));
        System.out.println();

        int matches=0;
        for (int i=0; i<size; i++)
        {
            if (array1[i] == array2[i])
            {
                matches++;
                System.out.println("Збіг " + (i+1) + "-ого елементу");
            }
        }
        System.out.println("Кількість збігів: " + matches);

    }
}
