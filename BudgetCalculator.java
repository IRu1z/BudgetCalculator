public class BudgetCalculator
{
    public static void main(String [] args)
    {
    final double SALARY = 3000.0;
    final double SAVINGS_PERCENT = 0.20;
    final double RENT_PERCENT = 0.30;
    final double GROCERIES_PERCENT = 0.15;
    final double ENTERTAINMENT_PERCENT = 0.10;

   double  monthlysalary = SALARY;
    double  savedamount;
    double  rentAmount;
    double  groceriesAmount;
    double  entertainmentAmount;
    double  totalExpenses;
    double  remainingBalance;

    savedamount = monthlysalary * SAVINGS_PERCENT;
    rentAmount = monthlysalary * RENT_PERCENT;
    groceriesAmount = monthlysalary * GROCERIES_PERCENT;
    entertainmentAmount = monthlysalary * ENTERTAINMENT_PERCENT;
    totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
    remainingBalance = monthlysalary - totalExpenses;

    System.out.println(monthlysalary);
    System.out.println(savedamount);
    System.out.println(rentAmount);
    System.out.println(groceriesAmount);
    System.out.println(entertainmentAmount);
    System.out.println(totalExpenses);
    System.out.println(remainingBalance);
    }
}