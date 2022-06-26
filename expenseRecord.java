import java.util.*;

public class expenseRecord{
    // private expense[] expenses;
    // List<expense> expenses = new ArrayList<expense>();
    //expense expenses[] = new expense[5];
    // int i = 0;
    ArrayList<expense> expenses = new ArrayList<expense>();
    public expenseRecord(){
    }

    public void addExpense(double amount, int m, int d, String payee, String category){
        expense e = new expense(amount, m, d, payee, category);
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
