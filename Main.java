import java.util.Scanner;

public class Main {

    public static Scanner scanner=new Scanner(System.in);
    public static ATM atm=new ATM();

    public static void main(String[] args)throws Exception {
        System.out.println("Welcome to your local ATM.");
        atm.nameChoice();
        atm.selectionLoop();



    }
    /*public static void mightThrowException(boolean shouldThrow)throws Exception{
        if(shouldThrow) {
            throw new Exception("exception");
        }
        System.out.println("No exception");*/
}
