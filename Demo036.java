public class Demo036 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;
        int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("The greatest number is: " + greatest);
    }
}
