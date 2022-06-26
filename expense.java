import java.util.*;

public class expense {
    private double amount;
    private Calendar date = new GregorianCalendar(); 
    private String payee;
    private String category;

    // constructor
    public expense(){
        this.amount = 0;
        date = new GregorianCalendar();
        this.payee = "";
        this.category = "";
    };

    //loaded constructor
    public expense(int m, int d, String category, String payee, double amount){
        this.amount = amount;
        date.set(m,d);
        this.payee = payee;
    }
    //set and get functions
    /////////////////////////////////////////////////////////
    public double getAmount(){
        return this.amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public String getDate(){
        return date.get(Calendar.MONTH)+"/"+ date.get(Calendar.DATE);
    }
    public void setDate(int m, int d){
        date.set(m,d);
    }

    public String getPayee(){
        return this.payee;
    }
    public void setPayee(String payee){
        this.payee = payee;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    ////////////////////////////////////////////////////////
    // Display
    public String toString()
   {
   return this.date + "\t" + this.payee + "\t" + this.amount + "\t" + this.category;
   }
}
