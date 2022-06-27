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
    //e_C = expense map divided by category to add up cost by each category
    //expense category
    //returns a Hashmap, used to display by category
    public HashMap expenseCategory(){
        
        HashMap<String,Double> e_C = new HashMap<String,Double>();
        
        for(expense E : eR.expenses){
            String category = E.getCategory();
            Double price = e_C.containsKey(category) ? e_C.get(category) : 0;
            price+=E.getAmount();
            e_C.put(category, price);
        }
        return e_C;
    }

    //used to calculate profit
    public double sumExpenses(){
        double sum=0;
        
        for(expense E : eR.expenses){
            sum+=E.getAmount();
        }
        return sum;
    }
    
    //annualReport.profit();
    public double profit(){
        double profit = this.sumRent()-this.sumExpenses();
        return profit;
    }


}
