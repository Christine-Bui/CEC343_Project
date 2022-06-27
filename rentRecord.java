import java.util.*;

public class rentRecord extends tenantList{
    ArrayList<Rent> rental = new ArrayList<Rent>();
    tenant t = new tenant();
    tenantList tL = new tenantList();

    public void addRent(String name, double rent_amount, int month)
    {
        Rent r = new Rent(name, rent_amount, month);

        if(rental.contains(r))
        {
            System.out.println("Rent record exists already.");
        }
        else
        {
            rental.add(r);
        }
    }

    public void displayRent()
    {

    }
}