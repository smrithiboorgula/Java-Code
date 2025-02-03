import java.util.*;

public class Demo008 {
    public static void main(String[] args0){
        Scanner sc = new Scanner(System.in);
        String username,pass;
        do{
            System.out.println("Hello Malla Reddy University, please login");
            System.out.println("Enter username: ");
            username = sc.next();
            System.out.println("Enter password: ");
            pass = sc.next();
        }while((!username.equals("Smrithi Boorgula"))||(!pass.equals("smrithi_123")));
        System.out.println("Successfully logged in");
    }
}