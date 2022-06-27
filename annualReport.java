import java.util.*;

public class annualReport{
    private rentRecord rR;
    private expenseRecord eR;


    //empty constructor
    public annualReport(){}
    
    
    // loaded constructor 
    public annualReport(rentRecord renRec, expenseRecord expRec){
        this.rR = renRec;
        this.eR = expRec;
    }

    //ook
    public double sumRent(){
        double sum=0;
        for(Rent R : rR.rental){
            sum+=R.getAmount();
        }
        return sum;
    }


    //hashmap<type1,type2> name = new Hashmap<>();
    public double sumExpenses(){
        double sum=0;
        HashMap<String,Double> expense_Category = new HashMap<String,Double>();
        
        int i = 0; 
        for(expense E : eR.expenses){
            expense_Category.put(E.getCategory(),E.getAmount());
        }
        return sum;
    }

    // public double sumExpenses(){
    //     double sum=0;
        
    //     for(expense E : eR.expenses){
    //         sum+=E.getAmount();
    //     }
    //     return sum;
    // }
    
    //annualReport.profit();
    public double profit(){
        double profit = this.sumRent()-this.sumExpenses();
        return profit;
    }


}
