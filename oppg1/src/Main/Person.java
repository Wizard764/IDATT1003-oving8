package Main;

public final class Person
{
    private String[] name;
    private Date bYear;
    Person(String[] name, int bYear)
    {
        this.name = name;
        this.bYear = new Date(bYear);
    }
    String getFirstName()
    {
        return name[0];
    }
    String getLegalFirstName()
    {
        String n = name[0];
        for(byte i = 1; i < name.length -1; i++)
        {
            n += " " + name[i];
        }
        return n;
    }
    String getLastName()
    {
        return name[name.length-1];
    }
    String getFullName()
    {
        String n = name[0];
        for(byte i = 1; i < name.length; i++)
        {
            n += " " + name[i];
        }
        return n;
    }
    String[] getName()
    {
        return name;
    }
    String getNameComponent(byte index)
    {
        return name[index];
    }
    int getBYear()
    {
        return bYear.year;
    }
}