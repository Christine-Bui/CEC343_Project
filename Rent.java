public class Rent{
    private int amount;
    private String name;
    private int month;
   
    public Rent(){
        
    }
    public Rent(String name, int amount, int month){
        this.name = name;
        this.amount = amount;
        this.month = month;
    }
    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
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