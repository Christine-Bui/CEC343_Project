import java.util.*;

public class expenseRecord{
    // private expense[] expenses;
    // List<expense> expenses = new ArrayList<expense>();
    //expense expenses[] = new expense[5];
    // int i = 0;
    ArrayList<expense> expenses = new ArrayList<expense>();
    public expenseRecord(){
    }

    public void addExpense(int month, int day, String payee, double amount, String category)
    {
        expense e = new expense(month, day, payee, amount, category);
        if(expenses.contains(e))
        {
            System.out.println("expense already exists");
    
        }
        else
        {
            expenses.add(e);        
       }
    }

    //constructor, create the list
    // public void expenseRecord(){}
    
    public void displayExpenses()
	{
        System.out.println("Date\t\tPayee\t\tAmount\t\tCategory");
        System.out.println("---------------------------------------------------");
        for(expense E: expenses)
		{
			System.out.println(E);
		}
    }
}
