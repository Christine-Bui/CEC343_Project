import java.util.ArrayList;
import java.util.List;

public class tenantList extends tenant {
    List<tenant> tenants = new ArrayList<tenant>();
    //tenant tenants[] = new tenant[5];
    int i = 0;
   public tenantList(){

   }

   public void addTenant(String name, int room){
    tenant t = new tenant(name, room);
    tenants.add(t);

   }

   public void displayTenant(){
    //System.out.println(tenants.toString());
    System.out.println("Apt#  Tenant Name" + "\n" +
    "-------------------");
    for(tenant T: tenants){
        System.out.println(T);
    
    }
    }

}
