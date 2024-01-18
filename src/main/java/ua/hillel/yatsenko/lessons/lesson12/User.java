package ua.hillel.yatsenko.lessons.lesson12;

public class User
{
    private String name;
    private String surname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private int age;
    private String email;
    private String phoneNumber;
    private double weight;
    private String pressure;
    private int steps;

    public User(String name, String surname, int birthDay, int birthMonth, int birthYear, String email, String phoneNumber, double weight, String pressure, int steps)
    {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;

        calculateAge();
    }

    public String getName()
    {
        return name;
    }

    public int getBirthDay()
    {
        return birthDay;
    }

    public int getBirthMonth()
    {
        return birthMonth;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public int getAge()
    {
        return age;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getPressure()
    {
        return pressure;
    }

    public void setPressure(String pressure)
    {
        this.pressure = pressure;
    }

    public int getSteps()
    {
        return steps;
    }

    public void setSteps(int steps)
    {
        this.steps = steps;
    }

    private void calculateAge()
    {
        int currentDay = 22;
        int currentMonth = 1;
        int currentYear = 2024;

        age = currentYear - birthYear;

        if (currentMonth < birthMonth)
        {
            age--;
        }
        else if (currentMonth == birthMonth)
        {
            if (currentDay < birthDay)
            {
                age--;
            }
        }
    }

    @Override
    public String toString()
    {
        return "Ім`я:\t" + getName() + "\n" +
                "Прізвище:\t" + getSurname() + "\n" +
                "Дата народження:\t" + getBirthDay() + "." + getBirthMonth() + "." + getBirthYear() + "\n" +
                "Вік:\t" + getAge() + "\n" +
                "Email:\t" + getEmail() + "\n" +
                "Номер телефону: " + getPhoneNumber() + "\n" +
                "Вага:\t" + getWeight() + "\n" +
                "Тиск:\t" + getPressure() + "\n" +
                "Кількість пройдених кроків:\t" + getSteps() + "\n" +
                "------------------------------------";
    }

    public void printAccountInfo()
    {
        System.out.println(this);
    }
}
