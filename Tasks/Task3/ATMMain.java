package Tasks.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        ATM atm=new ATM();
        User user=new User("jishan",3000,23434);
        users.add(user);
        User user2=new User("rahul",13200,636472);
        users.add(user2);
        User user3=new User("ravi",32000,63762);
        users.add(user3);
        Scanner sc =new Scanner(System.in);
        System.out.println("-----------------------------Welcome--------------------------- ");
        System.out.println("enter Your Account Number");
        double acNo=sc.nextDouble();
        //get the user from list of users
        User us=null;
        for(User u:users){
        if(u.getAccountNumber()==acNo){
                us=u;
                break;

        }}
        System.out.println("-----press 1 for case withdraw \n----- press 2 for case deposit \n ---- press 3 for balance check ");
        int op=sc.nextInt();
        
        switch (op) {
            case 1:
                    System.out.println("--Account Holder Name-- "+us.getName());
                       System.out.println("   Enter amount to be withdrawn  ");
                    //call withdraw method and save reamining balance
                    us.setSaveAmount(atm.withdraw(us.getSaveAmount(),sc.nextDouble()));
                    atm.checkBalance(us.getSaveAmount());
              
            case 2:
                    System.out.println("--- Enter case you want to deposit ---");
                        us.setSaveAmount(atm.deposit(acNo, sc.nextDouble()));
                        atm.checkBalance(us.getSaveAmount());
                        

                break;
        case 3:
                atm.checkBalance(us.getSaveAmount());
            default:
            System.out.println("press a valid key");
                break;
        }
       
    }
    
}
