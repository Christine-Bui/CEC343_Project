import java.util.ArrayList;
import java.util.List;

//expense(double amount, GregorianCalendar date, String payee, String Category)
public class expenseRecord {
    List<expense> expenses = new ArrayList<expense>();
    //expense expenses[] = new expense[5];
    int i = 0;

    //constructor, create the list
    public void expenseRecord(){}

    public void addExpense(double amount, GregorianCalendar date, String payee, String Category){
        expense e = new expense(amount, date, payee, Category);
    }
    
}
