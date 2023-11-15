package Main;

public class Date //Struct
{
    public int year;
    public byte month;
    public byte date;
    Date(int year, byte month, byte date)
    {
        this.year = year;
        this.month = month;
        this.date = date;
    }
    Date(int year)
    {
        this.year = year;
        this.month = 1;
        this.date = 1;
    }
}