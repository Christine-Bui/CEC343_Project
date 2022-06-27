
public class expense {
    private double amount;
    private int day;
    private int month;
    private String payee;
    private String category;

    // constructor
    public expense(){
        this.amount = 0;
        this.payee = "";
        this.category = "";
        this.day = 0;
        this.month = 0;
    };

    //loaded constructor
    public expense(int month, int day, String payee, double amount, String category){
        this.amount = amount;
        this.month = month;
        this.day = day;
        this.payee = payee;
        this.category = category;
    }
    //set and get functions
    /////////////////////////////////////////////////////////
    public double getAmount(){
        return this.amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
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
        return this.category;
    }
    ////////////////////////////////////////////////////////
    // Display
    public String toString()
   {
   return this.month + "/" + this.day + "\t" + this.payee + "\t" + this.amount + "\t" + this.category;
   }
}
