import java.util.*;
class account{
    public int balance=5500;
}
class atm_machine extends account{
    public void withdraw(int amount){
        if(this.balance<amount){
            System.out.println("insufficient balance to withdraw\nyour balance is = "+this.balance);
            logic();
        }
        this.balance=this.balance-amount;
        System.out.println("amount withdrawn successfully\nbalance remaining = "+this.balance);
        logic();
    }
    public void deposit(int amount){
        this.balance+=amount;
        System.out.println("amount deposited\nyour balance now is = "+this.balance);
        logic();
    }
    public void checkBalance(){
        System.out.println("your balance is = "+this.balance);
        logic();
    }
    void logic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome back!!\nWhat would you like to do?");
        System.out.println("press 1 to withdraw");
        System.out.println("press 2 to deposit");
        System.out.println("press 3 to check your balance");
        System.out.println("press 4 to exit");
        int ch=sc.nextInt();
        int amount;
        switch (ch) {
            case 1:
                System.out.println("enter amount to be withdrawn");
                amount=sc.nextInt();
                withdraw(amount);
                logic();
            case 2:
                System.out.println("enter amount to be deposited");
                amount=sc.nextInt();
                deposit(amount);
                logic();
            case 3:
                checkBalance();
                logic();
            case 4:
                System.exit(0);
            default:
                System.out.println("wrong choice");
                logic();
        }
        sc.close();
    }
}
public class banking{
    public static void main(String[] args){
        atm_machine ob=new atm_machine();
        ob.logic();
    }
}
