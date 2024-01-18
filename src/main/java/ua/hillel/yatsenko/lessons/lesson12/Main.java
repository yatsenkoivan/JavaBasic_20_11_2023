package ua.hillel.yatsenko.lessons.lesson12;

public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User("Name1", "Surname1", 1, 1, 1970, "email1@gmail.com", "123456789", 80, "120/80", 10000);
        User u2 = new User("Name2", "Surname2", 12, 6, 1983, "email2@gmail.com", "628562918", 70, "110/70", 5000);
        User u3 = new User("Name3", "Surname3", 31, 12, 1999, "email3@gmail.com", "452984102", 60, "120/90", 6000);
        User u4 = new User("Name4", "Surname4", 1, 1, 2000, "email4@gmail.com", "332425923", 67, "115/74", 7000);

        u1.printAccountInfo();
        u2.printAccountInfo();
        u3.printAccountInfo();
        u4.printAccountInfo();

        u1.setSurname("NewSurname1");
        u1.setWeight(90);
        u2.setPressure("100/60");
        u2.setSteps(7980);

        System.out.println("After changes:");

        u1.printAccountInfo();
        u2.printAccountInfo();


    }
}
