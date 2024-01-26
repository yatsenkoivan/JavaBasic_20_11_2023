package ua.hillel.yatsenko.lessons.lesson15;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        runDrinksMachine(scanner);
    }

    public static void runDrinksMachine(Scanner scanner)
    {
        while (true)
        {
            System.out.println("=====================================");
            Drinks.showTotalDrinks();
            Drinks.showTotalPrice();
            System.out.println("=====================================");
            System.out.println("Menu:");
            System.out.println("(1) - Buy a drink");
            System.out.println("(0) - Exit");

            if (scanner.hasNextInt())
            {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice)
                {
                    case 1:
                        buyDrinkMenu(scanner);
                        break;
                    case 0:
                        return;
                }
            }
            else
            {
                scanner.nextLine();
            }

        }
    }

    public static void buyDrinkMenu(Scanner scanner)
    {
        final String cancel = "0";

        while (true)
        {
            System.out.println("=====================================");
            System.out.println("Choose a drink to buy:");
            DrinksMachine[] drinks = DrinksMachine.values();
            for (DrinksMachine drink : drinks)
            {
                System.out.println("\t" + drink);
            }
            System.out.println("(0) - Cancel");

            String line = scanner.nextLine().toUpperCase();

            if (line.equals(cancel))
            {
                return;
            }

            DrinksMachine chosenDrink = null;
            for (DrinksMachine drink : drinks)
            {
                if (drink.name().equals(line))
                {
                    chosenDrink = drink;
                    break;
                }
            }

            if (chosenDrink == null)
            {
                System.out.println("Invalid drink name.");
                continue;
            }

            DrinksMachine drink = DrinksMachine.valueOf(line);
            Drinks.buyDrink(drink);
            return;
        }
    }

}
