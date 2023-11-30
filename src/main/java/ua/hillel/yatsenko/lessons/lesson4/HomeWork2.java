package ua.hillel.yatsenko.lessons.lesson4;

public class HomeWork2
{
    public static void main(String[] args)
    {
        int Li_first = 13;
        int Li_second = 24;
        int Li_third = 46;

        int Min_first = 9;
        int Min_second = 35;
        int Min_third = 12;

        long Li_amount = 860;
        long Min_amount = (long)(Li_amount * 1.5);

        long Li_total = Li_first*Li_amount + Li_second*Li_amount + Li_third*Li_amount;
        long Min_total = Min_first*Min_amount + Min_second*Min_amount + Min_third*Min_amount;

        System.out.println("Лі:\t" + Li_total);
        System.out.println("Мінь:\t" + Min_total);

    }
}
