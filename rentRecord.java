import java.util.*;

public class rentRecord extends tenantList{
    ArrayList<Rent> rental = new ArrayList<Rent>();
    ArrayList<ArrayList<Integer>> initial= new ArrayList<ArrayList<Integer>>();
    tenantList tL = new tenantList();

    public rentRecord(){

    }

    public rentRecord(tenantList tL){
        this.tL = tL;
    }

    public void addRent(String name, double rent_amount, int month)
    {
        Rent r = new Rent(name, rent_amount, month);
        ArrayList<Integer> payments = new ArrayList<Integer>(Collections.nCopies(13, 0));
        initial.add(payments);
        ArrayList<tenant> x = tL.getList();
        for(tenant t: x){
            System.out.println(t);
            System.out.println(t.getRoomNum());
        }

    }

    public void displayRent()
    {
        System.out.println("Apt. #" + "\t" + "Month Paid" + "\t" + "Amount Paid");
        System.out.println("--------------------------------------");
        for(ArrayList<Integer> r: initial)
        {
            System.out.println(r);
        }
        
        
    }
}