import java.util.*;

public class Demo006 {
    public static void main(String[] args){
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter username: ");
            String id = sc.next();
            System.out.println("Enter password: ");
            String pass = sc.next();
            if((id.equals("Smrithi Boorgula")) && ((pass.equals("smrithi_296")))){
                System.out.println("Hello Smrithi Boorgula! Welcome");
                break;
            }else{
                System.out.println("Credentials does not match. Please enter again");
            }
        }
    }
}