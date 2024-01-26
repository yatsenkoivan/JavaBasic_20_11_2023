package ua.hillel.yatsenko.lessons.lesson15;

public class Drinks
{
    private static double totalPrice=0;
    private static int totalDrinks=0;

    public static void buyDrink(DrinksMachine drink)
    {
        switch(drink)
        {
            case COFFEE:
                buyCoffee();
                break;
            case TEA:
                buyTea();
                break;
            case LEMONADE:
                buyLemonade();
                break;
            case MOJITO:
                buyMojito();
                break;
            case MINERAL_WATER:
                buyMineralWater();
                break;
            case COCA_COLA:
                buyCocaCola();
                break;
            default:
                return;
        }
        totalDrinks++;
        System.out.println("You successfully bought " + drink.name() + " for " + drink.getPrice());
    }
    private static void buyCoffee()
    {
        totalPrice += DrinksMachine.COFFEE.getPrice();
    }
    private static void buyTea()
    {
        totalPrice += DrinksMachine.TEA.getPrice();
    }
    private static void buyLemonade()
    {
        totalPrice += DrinksMachine.LEMONADE.getPrice();
    }
    private static void buyMojito()
    {
        totalPrice += DrinksMachine.MOJITO.getPrice();
    }
    private static void buyMineralWater()
    {
        totalPrice += DrinksMachine.MINERAL_WATER.getPrice();
    }
    private static void buyCocaCola()
    {
        totalPrice += DrinksMachine.COCA_COLA.getPrice();
    }
    public static double getTotalPrice()
    {
        return totalPrice;
    }
    public static int getTotalDrinks()
    {
        return totalDrinks;
    }

    public static void showTotalPrice()
    {
        System.out.println("Total price:\t" + getTotalPrice());
    }
    public static void showTotalDrinks()
    {
        System.out.println("Total drinks:\t" + getTotalDrinks());
    }
}
