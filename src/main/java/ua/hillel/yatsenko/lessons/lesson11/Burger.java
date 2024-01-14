package ua.hillel.yatsenko.lessons.lesson11;

public class Burger
{
    String bread;
    String meat;
    String greens;
    String mayonnaise;
    String doubleMeat;

    public Burger(String bread, String meat, String greens, String mayonnaise)
    {
        this(bread, meat, greens, mayonnaise, null);
    }
    public Burger(String bread, String meat, String greens)
    {
        this(bread, meat, greens, null, null);
    }
    public Burger(String bread, String meat, String greens, String mayonnaise, String doubleMeat)
    {
        this.bread = bread;
        this.meat = meat;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println(this);
    }

    @Override
    public String toString()
    {
        return "Булочка:\t\t" + (bread != null ? "Так" : "Ні") + "\n" +
                "М'ясо:\t\t\t" + (meat != null ? "Так" : "Ні") + "\n" +
                "Зелень:\t\t\t" + (greens != null ? "Так" : "Ні") + "\n" +
                "Майонез:\t\t" + (mayonnaise != null ? "Так" : "Ні") + "\n" +
                "Подвійне м'ясо:\t" + (doubleMeat != null ? "Так" : "Ні") + "\n" +
                "-------------------------";
    }
}
