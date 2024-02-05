package Tasks.Task3;
// user class it contains users details
public class User {
   private String name;
   private double saveAmount=2500;
   private double accountNumber;
public User() {
}
public User(String name, double saveAmount, double accountNumber) {
    this.name = name;
    this.saveAmount = saveAmount;
    this.accountNumber = accountNumber;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getSaveAmount() {
    return saveAmount;
}
public void setSaveAmount(double saveAmount) {
    this.saveAmount = saveAmount;
}
public double getAccountNumber() {
    return accountNumber;
}
public void setAccountNumber(double accountNumber) {
    this.accountNumber = accountNumber;
}
}
