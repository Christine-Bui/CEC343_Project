public class annualReport{
    private rentRecord rR;
    private expenseRecord eR;

    // constructor 
    public void annualReport(rentRecord renRec, expenseRecord expRec){
        this.rR = renRec;
        this.eR = expRec;
    }
    
    //ook
    public double sumRent(){
        double sum=0;
        for(Rent R : rR.rental){
            //sum+=R.getAmount();
        }
        return sum;
    }

    
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
