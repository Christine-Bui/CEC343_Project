public class Rent{
    private double amount;
    private String name;
    private int month;
   
    public Rent(){
        
    }
    public Rent(String name, double amount, int month){
        this.name = name;
        this.amount = amount;
        this.month = month;
    }
    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }
}