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
        expenses.add(e);
        Collection.sort(e);
    }
    
    
   public void displayTenant(){
    //System.out.println(tenants.toString());
    System.out.println("date\tamount\tpayee\tcategory\n");
    for(expense T: expenses){
        System.out.println(T.toString());
        }
    }


}
