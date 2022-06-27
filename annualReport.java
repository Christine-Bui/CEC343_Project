import java.util.*;

public class annualReport{
    private rentRecord rR;
    private expenseRecord eR;
    HashMap<String,Double> e_C = new HashMap<String,Double>();


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
    //no return, affects class attributes
    public void expenseCategory(){
        //HashMap<String,Double> e_C = new HashMap<String,Double>();
        for(expense E : eR.expenses){
            String category = E.getCategory();
            Double price = this.e_C.containsKey(category) ? this.e_C.get(category) : 0;
            price+=E.getAmount();
            this.e_C.put(category, price);
        }
        //return e_C;
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

    public void displayAnnualReport(){
        System.out.println("Annual Summary\n-------------------------");
        //loop to print out expense categories and hashmap
        //printing Rent
        System.out.println("Income");
        System.out.println("Rent: " + this.sumRent());

        //print expense category summary
        System.out.println("Expenses");
        for (String k : e_C.keySet()){
            System.out.printf("%s: %.2f%n", k, e_C.get(k));
        }

        //print profit
        System.out.println("\nBalance: " + this.profit());
    }

}
