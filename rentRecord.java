import java.util.*;

public class rentRecord extends tenantList{
    ArrayList<Rent> rental = new ArrayList<Rent>();
    ArrayList<ArrayList<Integer>> initial= new ArrayList<ArrayList<Integer>>(2);
    ArrayList<Integer> payments;
    tenantList tL = new tenantList();
    int rN;


    public rentRecord(){

    }

    public rentRecord(tenantList tL){
        this.tL = tL;
    }

    public ArrayList<ArrayList<Integer>> getRent(){
        return this.initial;
    };

    public void addRent(String name, int rent_amount, int month)
    {
        //System.out.println("adding new tenant...");
        Rent r = new Rent(name, rent_amount, month);
        ArrayList<tenant> x = tL.getList();

        //System.out.println("getting room number...");
        //x is tenant list
        //this for loop is to match the name with the room number
        for(tenant t: x){
            //if name is in tenant list, then get room number
            if(t.getName().equals(name)){
                rN = t.getRoomNum();
            }
        }

        //if the size of the list is 0, we add the first element to it
        if(initial.size() == 0){
            this.payments = new ArrayList<Integer>(Collections.nCopies(13, 0));
            this.payments.set(0, rN);
            this.payments.set(month, rent_amount);
            this.initial.add(payments);
        }else{
            for(int i = 0; i <= initial.size()-1; i++){
                //System.out.println("interation " +i);
                if(initial.get(i).get(0) == rN){
                    initial.get(i).set(month, rent_amount);
                }
                else{
                    this.payments = new ArrayList<Integer>(Collections.nCopies(13, 0));
                    this.payments.set(0, rN);
                    this.payments.set(month, rent_amount);
                    this.initial.add(payments);
            }
            }
        }

        
    }

    public void displayRent()
    {
        System.out.println("AptNo\t Jan\t Feb\t Mar\t Apr\t May\t Jun\t Jul\t Aug\t Sep\t Oct\t Nov\t Dec");
        System.out.println("------------------------------------------------------------------------------------------------------");
        for(ArrayList<Integer> r: initial)
        {
            System.out.println(r.toString().replace(",", "\t")  
            .replace("[", "")  
            .replace("]", "")  
            .trim());      
        }
        
    }
}