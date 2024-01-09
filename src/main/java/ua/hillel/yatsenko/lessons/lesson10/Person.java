package ua.hillel.yatsenko.lessons.lesson10;

public class Person
{
    static String personInfo(String firstName, String lastName, String city, String phoneNumber)
    {
        return "Зателефонувати громадянину " + firstName + " " + lastName + " з міста " + city + " можна за номером " + phoneNumber + ".";
    }
    public static void main(String[] args)
    {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }
}
