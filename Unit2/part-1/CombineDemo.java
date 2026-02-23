

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){
        super(message);
    }
}
class BankAccount{
    double balance =5000;
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance ){
            throw new InsufficientBalanceException ("insufficient balance ");
        }
        balance-=amount;
        System.out.println("withdraw successful");
    }
}
public class CombineDemo {
    public static void main(String[] args) {
        try {
            int x=10/0;
        } catch (Exception e) {
            System.out.println("error");

        }

        BankAccount account=new BankAccount();
        try {
           account.withdraw(7000); 
        } catch (Exception e) {
            System.out.println("custom error"+e.getMessage());
        }
        System.out.println("successful");
        
    }
    
}
