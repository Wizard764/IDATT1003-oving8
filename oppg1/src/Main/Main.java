package Main;
import InputUtil.InputUtil;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new Scanner(System.in);
        Employee a = new Employee();
        Employee b = new Employee();
        // Test getters and print their return values
        System.out.println("Employee ID: " + b.getEmployeeId());
        System.out.println("Personalia: " + b.getPersonalia().getFullName());
        System.out.println("Employment Year: " + b.getEmploymentYear());
        System.out.println("Monthly Wage: " + b.getMonthlyWage());
        System.out.println("Tax Percentage: " + b.getTaxPercentage());
        System.out.println("Monthly Tax: " + b.getMonthlyTax());
        System.out.println("Yearly Wage: " + b.getYearlyWage());
        System.out.println("Yearly Tax: " + b.getYearlyTax());
        System.out.println("Formal Name: " + b.getFormalName());
        System.out.println("Age: " + b.getAge());
        System.out.println("Years Employed: " + b.getYearsEmployed());
        System.out.println("Employed Longer Than 5 years: " + b.EmployedLongerThan(5));

        // Test setters and print values before and after setting
        System.out.println("Monthly Wage before setting: " + b.getMonthlyWage());
        b.setMonthlyWage(7500.0f);
        System.out.println("Monthly Wage after setting: " + b.getMonthlyWage());

        System.out.println("Tax Percentage before setting: " + b.getTaxPercentage());
        b.setTaxPercentage(0.28f);
        System.out.println("Tax Percentage after setting: " + b.getTaxPercentage());

        String[] options = {"Set monthly wage", "Set tax percentage"};
        while(true)
        {
            int option = InputUtil.InputInt("1. Set monthly wage.\n2. Set tax percentage\n", "You must enter either 1 or 2", 1, 2, sc);
            if(option == 1)
            {
                b.setMonthlyWage(InputUtil.InputFloat("Enter new wage: ", "You must enter a valid decimal number", sc));
                System.out.println("New wage: " + Float.toString(b.getMonthlyWage()));
            }
            else
            {
                b.setTaxPercentage(InputUtil.InputFloat("Enter new tax percentage(decimal form, i.e: '.22'): ", "You must enter a valid decimal number", sc));
                if(b.getTaxPercentage() >= 1)
                {
                    System.out.println("(That seems a tad excessive if you ask me, but very well)");
                }
                System.out.println("New tax percentage: " + Float.toString(b.getTaxPercentage()));
            }
        }
    }
}