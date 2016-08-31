/**
 * Created by joe on 8/31/16.
 */
public class ATM {
    private String name;
    private double balance=100.00;

    public void nameChoice()throws Exception{
        System.out.println("Please enter your name:");
        name = Main.scanner.nextLine();
        if (name.length()==0){
            throw new Exception("Name not entered.");
        }
        System.out.println("Welcome " + name);
    }

    //selection loop
    public void selectionLoop() throws Exception {

        System.out.println("What would you like to do?");
        System.out.println("1: Check balance");
        System.out.println("2: Withdraw money");
        System.out.println("3: Cancel");

        String cancel = "no";
        while (cancel == "no") {

            String selection=Main.scanner.nextLine();
           String[] acceptableInput={"1","2","3"};
           boolean test = false;
            while(test==false){
                for(String stringStep:acceptableInput){
                    if(stringStep=="1"||stringStep=="2"||stringStep=="3"){
                        test=true;
                    }
                    else{
                       System.out.println("Please enter a valid input:");
                        break;
                    }
                }
            }

            switch (selection) {
                case "1":
                    checkBalance();
                    System.out.println("What would you like to do?");
                    break;
                case "2": {
                    withdrawMoney();
                    System.out.println("What would you like to do?");
                    break;
                }
                case "3":
                    cancel="yes";
                    break;
            }
        }
        System.out.println("Thank you and please come again");
    }

    //check balance
    public void checkBalance() {

        System.out.println("Your balance is: "+balance);
        return;
    }

    //withdraw
    public double withdrawMoney()throws Exception {
        System.out.println("Please enter the amount you'd like to withdraw:");
        double amount=Main.scanner.nextDouble();
        //check input
        if (amount<0){
            System.out.println(amount+" is not valid");
        }

        if(amount>balance){
            throw new Exception("The attempted withdraw exceeded your balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Your balance is now: $"+balance);
            System.out.println("Please take your money");
            return balance;
            }

        }
    }

