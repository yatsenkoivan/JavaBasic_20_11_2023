package ua.hillel.yatsenko.lessons.lesson14;

public interface LinuxOS
{
    default void info()
    {
        System.out.println("LinuxOS device");
    }
}
