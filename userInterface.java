import java.util.Scanner;

public class userInterface extends tenant{
    static Scanner x = new Scanner(System.in);
    static String input;
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
                    quit = true;
                    break;
                case "r":
                    //display payment
                    quit = true;
                    break;
                case "e":
                    //display expense
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
                    quit = true;
                    break;
                case "r":
                    //rent payment
                    quit = true;
                    break;
                case "e":
                    //expense
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