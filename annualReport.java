// 

public class annualReport{
    private rentRecord rR;
    private expenseRecord eR;

    // constructor 
    public void annualReport(rentRecord renRec, expenseRecord expRec){
        this.rR = renRec;
        this.eR = expRec;
    }

    public double sumRent(){
        double sum=0;
        for(Rent R : rR){}
        return sum;
    }

    public double sumExp(){
        double sum=0;
        for(expense E : eR){}
        return sum;
    }
}
