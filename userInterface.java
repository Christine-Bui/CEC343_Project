import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
import java.util.Scanner;

public class userInterface {
    static Scanner x = new Scanner(System.in);
    static String input;
    static tenantList tL = new tenantList();

    static expenseRecord eR = new expenseRecord();


    public static void display(){
        boolean quit = false;
        while(quit == false){
            System.out.println("Enter 't' to display tenants" );
            System.out.println("Enter 'r' to display rents" );
            System.out.println("Enter 'e' to display expenses" );
            System.out.println("Enter 'a' to annual report" );
            input = x.nextLine();

            switch(input){
                case "t":
                    //display tenant
                    tL.displayTenant();
                    quit = true;
                    break;
                case "r":
                    //display payment
                    quit = true;
                    break;
                case "e":
                    //display expense
                    eR.displayExpenses();
                    quit = true;
                    break;
                case "a":
                    //display annual report
                    quit = true;
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    public static void add(){
        boolean quit = false;
        while(quit == false){
            System.out.println("Enter 't' to add tenant" );
            System.out.println("Enter 'r' to record rent payment" );
            System.out.println("Enter 'e' to record expense" );
            input = x.nextLine();

            switch(input){
                case "t":
                    //add tenant
                    tenant tenantName = new tenant();
                    System.out.print("Enter tenant's name: ");
                    input = x.nextLine();
                    tenantName.setName(input);

                    tenant tenantRoom = new tenant();
                    Scanner y = new Scanner(System.in);
                    System.out.print("Enter tenant's room number: ");
                    int roomNum = y.nextInt();
                    tenantRoom.setRoomNum(roomNum);
                    tL.addTenant(tenantName.getName(), tenantRoom.getRoomNum());
                    quit = true;
                    break;
                case "r":
                    //rent payment
                    quit = true;
                    break;
                case "e":
                    //expense
                    expense month = new expense();
                    System.out.print("Enter month (1-12): ");
                    int m = x.nextInt();
                    month.setMonth(m);

                    expense day = new expense();
                    Scanner f = new Scanner(System.in);
                    System.out.print("Enter day (1-31): ");
                    int d = f.nextInt();
                    day.setDay(d);

                    expense category = new expense();
                    Scanner k = new Scanner(System.in);
                    System.out.print("Enter expense category (Repairing, Utilities): ");
                    String c = k.nextLine();
                    category.setCategory(c);

                    expense payee = new expense();
                    Scanner b = new Scanner(System.in);
                    System.out.print("Enter payee (Bob's Hardware, Big Electric Co): ");
                    String p = b.nextLine();
                    payee.setPayee(p);

                    expense amount = new expense();
                    Scanner o = new Scanner(System.in);
                    System.out.print("Enter amount (39.95): ");
                    int a = o.nextInt();
                    amount.setAmount(a);

                    eR.addExpense(month.getMonth(), day.getDay(), payee.getPayee(), amount.getAmount(),  category.getCategory());
                    quit = true;
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    public static void menu(){
        boolean quit = false;
        
        while(quit == false){
            System.out.println("Enter 'i' to input data" );
            System.out.println("Enter 'd' to display data" );
            System.out.println("Enter 'q' to quit" );
            input = x.nextLine();
                
            switch(input){
                case "i":
                    add();
                    break;
                case "d":
                    display();
                    break;
                case "q":
                    System.out.println("Have a good day!");
                    quit = true;
                    break;
                default:
                    break;
            }       
        
        }
    }
    public static void main(String[] args){
        menu();
    }
}