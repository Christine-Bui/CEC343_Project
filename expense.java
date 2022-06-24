public class expense {
    //hello
    private double price;
    private String date; //add the module date later and replace string
    private String payee;

    // constructor
    public expense(){
        this.price = 0;
        this.date = "no date";
        this.payee = "";
    };

    //loaded constructor
    public expense(double price, String date, String payee){
        this.price = price;
        this.date = date;
        this.payee = payee;
    }
    //set and get fucnitons
    /////////////////////////////////////////////////////////
    public double getPrice(){return this.price;}
    public void setPrice(double price){this.price = price;}
    
    public String getDate(){return this.date;}
    public void setDate(String date){this.date = date;}

    public String getPayee(){return this.payee;}
    public void setPayee(String payee){this.payee = payee;}
    ////////////////////////////////////////////////////////
}
