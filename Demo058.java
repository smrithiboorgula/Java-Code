import java.util.*;

public class Demo058 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Factros of " +number+ " are: ");

        for(int i = 1; i <= number; i++){
            if(number %i == 0){
                System.out.println(i);
            }
        }
    }
}