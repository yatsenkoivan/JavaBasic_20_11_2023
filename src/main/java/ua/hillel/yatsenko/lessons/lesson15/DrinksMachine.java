package ua.hillel.yatsenko.lessons.lesson15;

public enum DrinksMachine
{
    COFFEE(100),
    TEA(50),
    LEMONADE(75),
    MOJITO(150),
    MINERAL_WATER(25),
    COCA_COLA(100);


    DrinksMachine(double price)
    {
        this.price = price;
    }

    final double price;

    double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return name() + " - " + price;
    }

}
