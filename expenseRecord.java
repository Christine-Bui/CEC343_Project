import java.util.*;

public class expenseRecord{
    // private expense[] expenses;
    // List<expense> expenses = new ArrayList<expense>();
    //expense expenses[] = new expense[5];
    // int i = 0;
    ArrayList<expense> expenses = new ArrayList<expense>();
    public expenseRecord(){
    }

    public void addExpense(int month, int day, String category, String payee, double amount){
        expense e = new expense(month, day, category, payee, amount);
    }

    //constructor, create the list
    // public void expenseRecord(){}
    
    public void displayExpenses()
	{
        System.out.println("Date\tPayee\tCategory");
        System.out.println("----------------------------------------");
        for(expense E: expenses)
		{
			System.out.println(E);
		}
    }
}
