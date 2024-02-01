package Tasks.Task3;

public interface ATMInterface {
    
    public void checkBalance (double saveAmount);
    public double withdraw(double saveAmount,double amount);
    public double deposit(double saveAmount, double deposit);

}
