import java.util.*;

public class rentRecord extends tenantList{
    ArrayList<Rent> rental = new ArrayList<Rent>();
    ArrayList<ArrayList<Integer>> initial= new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> payments;
    tenantList tL = new tenantList();
    int rN;

    public rentRecord(){

    }

    public rentRecord(tenantList tL){
        this.tL = tL;
    }

    public void addRent(String name, int rent_amount, int month)
    {
        Rent r = new Rent(name, rent_amount, month);
        ArrayList<tenant> x = tL.getList();
        for(tenant t: x){
            //if name is in tenant list, then get room number
            if(t.getName().equals(name)){
                rN = t.getRoomNum();
            }
        }
        for(int i = 0; i <= initial.size()-1; i++){
            if(initial.get(i).get(0) == rN){
                initial.get(i).set(month, rent_amount);
            }
            else{
                payments = new ArrayList<Integer>(Collections.nCopies(13, 0));
                payments.set(0, rN);
                payments.set(month, rent_amount);
                initial.add(payments);
            }
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
        System.out.println(initial);
        
        
    }
}