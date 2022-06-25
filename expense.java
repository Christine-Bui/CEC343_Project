import java.util.*;

public class expense {
    private double amount;
    private Date date; 
    private String payee;
    private String category;

    // constructor
    public expense(){
        this.amount = 0;
        this.payee = "";
        this.category = "";
    };

    //loaded constructor
    public expense(double amount, Date date, String payee){
        this.amount = amount;
        this.date = date;
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
    
    // public String getDate(){
    //     return this.date;
    // }
    // public void setDate(String date){
    //     this.date = date;
    // }

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
    System.out.println("Date\tPayee\tCategory");
    System.out.println("----------------------------------------");
   return super.toString() + this.date + "\t" + this.payee + "\t" + this.amount + "\t" + this.category;
   }
}
