import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

public class tenantList extends tenant{
    ArrayList<tenant> tenants = new ArrayList<tenant>();
   public tenantList(){

   }
   public void addTenant(String name, int room){
    //tenants.add(t);
    tenant t = new tenant(name, room);
   
    if(tenants.contains(t)){
        //tenants.add(t);
        System.out.println("tenant already exists");

    }
    else{
        tenants.add(t);        
    }
    Collections.sort(tenants);

    
   }

   public void displayTenant(){
    //System.out.println(tenants.toString());
    System.out.println("Apt#\tTenant Name" + "\n" +
    "-------------------");
    for(tenant T: tenants){
        System.out.println(T);
    }
    }

    public ArrayList<tenant> getList(){
        return tenants;
    }
}
