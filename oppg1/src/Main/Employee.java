package Main;
import java.util.GregorianCalendar;

public class Employee
{
    private static int idCounter = 0;
    private static java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
    boolean calInitialized = false;
    private Person personalia;
    private int employeeId;
    private Date employmentYear;
    private float monthlyWage;
    private float taxPercentage;//Tax percentage stored as decimal, i.e.: "0.32"
    /*********************Constructors*********************/
    Employee(String[] name, int bYear, int employeeId, int employmentYear, float monthlyWage, float taxPercentage)//Enter all info
    {
        personalia = new Person(name, bYear);
        this.employeeId = employeeId;
        this.employmentYear = new Date(employmentYear);
        this.monthlyWage = monthlyWage;
        this.taxPercentage = taxPercentage;
    }
    Employee(String name, int bYear, int employeeId, int employmentYear, float monthlyWage, float taxPercentage)//Enter all info with name in one string
    {
        this(name.split(" "), bYear, employeeId, employmentYear, monthlyWage, taxPercentage);
    }
    Employee(String[] name, int bYear, int employmentYear, float monthlyWage, float taxPercentage)//Enter all info except id
    {
        this(name, bYear, idCounter, employmentYear, monthlyWage, taxPercentage);
        idCounter++;
    }
    Employee(String[] name, int bYear, float monthlyWage, float taxPercentage)//Enter all info except id and employment date, used for adding new employees
    {
        this(name, bYear, idCounter, (int)cal.get(java.util.Calendar.YEAR), monthlyWage, taxPercentage);
        idCounter++;
    }
    Employee(String[] name, int bYear, float monthlyWage)//Enter all info except id, employment year and tax percentage
    {
        this(name, bYear, idCounter, cal.get(java.util.Calendar.YEAR), monthlyWage, .22f);
        idCounter++;
    }
    Employee(String[] name, int bYear)//Enter all info except id, employment year, tax percentage and income
    {
        this(name, bYear, idCounter, cal.get(java.util.Calendar.YEAR), 664680.0f, .22f);
        idCounter++;
    }
    Employee()//default constructor, add test employee
    {
        this("John Smith", 2000, idCounter, cal.get(java.util.Calendar.YEAR), 66460.0f, .22f);
        idCounter++;
    }
    /*********************Getters*********************/
    public Person getPersonalia()
    {
        return personalia;
    }
    public int getEmployeeId()
    {
        return employeeId;
    }
    public Date getEmploymentYear()
    {
        return employmentYear;
    }
    public float getMonthlyWage()
    {
        return monthlyWage;
    }
    public float getTaxPercentage()
    {
        return taxPercentage;
    }
    public float getMonthlyTax()
    {
        return monthlyWage * taxPercentage;
    }
    float getYearlyWage()
    {
        return monthlyWage * 12.0f;
    }
    float getYearlyTax()
    {
        return getMonthlyTax() * 10.5f;
    }
    /*********************Calculating getters*********************/
    String getFormalName()
    {
        return personalia.getLastName() + ", " + personalia.getLegalFirstName();
    }
    int getAge()
    {
        return cal.get(java.util.Calendar.YEAR) - personalia.getBYear();
    }
    int getYearsEmployed()
    {
        return cal.get(java.util.Calendar.YEAR) - employmentYear.year;
    }
    boolean EmployedLongerThan(int years)
    {
        return getYearsEmployed() > years;
    }
    /*********************Setters*********************/
    public void setMonthlyWage(float monthlyWage)
    {
        this.monthlyWage = monthlyWage;
    }
    public void setTaxPercentage(float taxPercentage)
    {
        this.taxPercentage = taxPercentage;
    }
}