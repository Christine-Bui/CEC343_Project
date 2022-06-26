import java.util.*;

public class rentRecord
{
    ArrayList<Rent> rental = new ArrayList<Rent>();

    public void addRent(int month, int day, String name, int room, double rent_amount)
    {
        Rent r = new Rent(month, day, name, room, rent_amount);
    }
}