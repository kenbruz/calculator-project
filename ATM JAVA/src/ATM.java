import java.util.Scanner;

public class ATM{
    private int balance;
    private int pin =2002;

    public ATM(int balance, int pin){
        this.balance= balance;
        this.pin= pin;
}

    public void displayInfo(){
        System.out.println("1.check balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Change pin");
        System.out.println("5.Exit");
    }

    public void deposit(int amount) {
        balance+=amount;
    }

    public void withdraw(int amount) {
        if (balance<amount){
            System.out.println("Insufficient funds");
            return;
        }
        balance-=amount;
    }

    public int getBalance() {
        return balance;
    }

   public boolean validatePin(int pin) {
        return this.pin==pin;
   }

   public void changePin(int newPin) {
        pin = newPin;
        System.out.println("pin changed!");
   }

    public static void main(String[] args) {
       ATM atm = new ATM(9000,2002) ;
       atm.displayInfo();
       System.out.print("Enter your pin");
       int pin = Integer.parseInt(System.console().readLine());
       if (atm.validatePin(pin)) {
           int option = 0;
           while (option!=5){
               atm.displayInfo();
               option = Integer.parseInt(System.console().readLine());
               switch (option) {
                   case 1:
                       System.out.println("balance: "+atm.getBalance());
                       break;

                   case 2:
                       System.out.print("Enter amount to deposit: ");
                      int amount = Integer.parseInt(System.console().readLine());;
                       atm.deposit(amount);
                       break;

                   case 3:
                       System.out.print("Enter amount to deposit: ");
                       int withdrawAmount = Integer.parseInt(System.console().readLine());;
                       atm.withdraw(withdrawAmount);
                       break;

                   case 4:
                       System.out.print("Enter new pin: ");
                      int newPin =Integer.parseInt(System.console().readLine());
                      atm.changePin(newPin);
                       break;

                   case 5:
                       System.out.println("thank you for using my ATM!: ");
                       break;

                   default:
                       break;
               }
           }
           atm.displayInfo();
       }
       else{
           System.out.println("you have entered an invalid pin");
       }
    }
}
