package ua.hillel.yatsenko.lessons.lesson6;

public class HomeWork2
{
    static boolean CheckShuttle(int number)
    {
        while (number > 0)
        {
            if (number%10 == 4 || number%10 == 9) return false;
            number /= 10;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int totalAmount = 100;

        for (int found=0, current=1; found < totalAmount; current++)
        {
            if (CheckShuttle(current))
            {
                System.out.println(current);
                found++;
            }
        }
    }
}
