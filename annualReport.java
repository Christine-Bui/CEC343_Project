import java.util.*;

public class annualReport{
    private rentRecord rR = new rentRecord();
    private expenseRecord eR = new expenseRecord();

    //store category name and amount
    HashMap<String,Double> e_C = new HashMap<String,Double>();



    //empty constructor
    public annualReport(){}
    
    
    // loaded constructor 
    public annualReport(rentRecord renRec, expenseRecord expRec){
        this.rR = renRec;
        this.eR = expRec;
        
        
    }

    //
    public double sumRent(){
        double sum=0;
        ArrayList<ArrayList<Integer>> rentList = rR.getRent();
        for(ArrayList<Integer> room : rentList){
            for(int i=1; i<room.size(); i++){
                sum+=room.get(i);
            }
            //sum+=R.getAmount();
        }
        return sum;
    }


    //hashmap<type1,type2> name = new Hashmap<>();
    //e_C = expense map divided by category to add up cost by each category
    //expense category
    //no return, affects class attributes
    public void expenseCategory(){
        //for each expense in the list of expenses, we get the category
        //then see if the hashmap has the key, then get the value, add it to the price
        //then add the new key value pair to the hashmap, or rather, replace them.
        for(expense E : eR.getExpenses()){
            String category = E.getCategory();
            Double price = this.e_C.containsKey(category) ? this.e_C.get(category) : 0;
            price+=E.getAmount();
            this.e_C.put(category, price);
        }
        
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
        this.expenseCategory();
        System.out.println("Expenses");
        for (String k : e_C.keySet()){
            System.out.printf("%s: %.2f%n", k, e_C.get(k));
        }
        // 
        // e_C.entrySet().forEach( entry -> {
        //     System.out.println( entry.getKey() + " : " + entry.getValue() );
        // });
        // Set set = e_C.entrySet();
        // Iterator i = set.iterator();
        // // Display elements
        // while(i.hasNext()) {
        //     Map.Entry me = (Map.Entry)i.next();
        //     System.out.print(me.getKey() + ": ");
        //     System.out.println(me.getValue());
        // }

        //print profit
        System.out.println("\nBalance: " + this.profit());
    }

}
