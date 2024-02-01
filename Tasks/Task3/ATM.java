package Tasks.Task3;

public class ATM implements ATMInterface {

    @Override
    public void checkBalance(double saveAmount) {
       
        System.out.println("you have "+saveAmount+" rupees in your Account");
        
    }

    @Override
    public double withdraw( double saveAmount,double amount) {
       
            //minimum balance must be 100 rupees
        if(saveAmount-amount>=100){
            System.out.println("--- collect your money ---");
             return saveAmount-=amount;

        }else {
            System.out.println("--- you donot have enough balance ---");
            return saveAmount;
        }
        
     
    }

    @Override
    public double deposit(double saveAmount , double deposit) {


       
        return saveAmount+deposit;
    }
    
}
