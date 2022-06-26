
public class expenseRecord{
    private expense[] expenses;
    // List<expense> expenses = new ArrayList<expense>();
    //expense expenses[] = new expense[5];
    // int i = 0;
    public expenseRecord(){
        expenses = new expense[10];
    }

    public expenseRecord(expense[] expenses){
        this.expenses = expenses;
    }

    //constructor, create the list
    // public void expenseRecord(){}

    public expense[] getExpense(){
        // expense e = new expense();
        return expenses;
    }

    public void setExpense(expense[] expenses){
        this.expenses = expenses;
    }
    
    public String toString()
	{   String display = expenses.toString();
        for(expense e: expenses)
		{
			display = display + e.toString();
		}
		display = display + "-------------------------------------" + "\n";
        return display;
    }
}
