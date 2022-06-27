import java.util.*;

public class rentRecord
{
    ArrayList<Rent> rental = new ArrayList<Rent>();

    public void addRent(int month, String name, double rent_amount)
    {
        Rent r = new Rent(month, name, rent_amount);

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