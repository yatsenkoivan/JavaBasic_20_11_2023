package ua.hillel.yatsenko.lessons.lesson14;

public class Main
{
    public static void main(String[] args)
    {
        Androids android = new Androids();
        android.info();
        android.call();
        android.sms();
        android.internet();

        System.out.println("=====================================");

        iPhones iphone = new iPhones();
        iphone.info();
        iphone.call();
        iphone.sms();
        iphone.internet();
    }
}
