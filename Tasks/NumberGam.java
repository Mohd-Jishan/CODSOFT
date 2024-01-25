package Tasks;



import java.util.Random;
import java.util.Scanner;

public class NumberGam {
    public static Boolean numberGame(int number,int []res) {
        Scanner sc = new Scanner(System.in);
       
        int guess = 5;
        while (guess > 0) {
             System.out.println("enter a number");
             int input = sc.nextInt();
             if(input==number){
                res[1]++;
             }else if(input>number){
                System.out.println("enter a small number");
                res[0]++;
             }else{
                System.out.println("enter a big number");
                res[0]++;
             }

             guess--;
        }
        System.out.println("you cross your guess limit \n if you want to play again press one else press any key ");
        int want=sc.nextInt();
        if(want==1){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        // int num = new Random().nextInt(100);
        int num=(int)Math.floor((Math.random()*100)+1);
            System.out.println(num);
       
       

        int []res=new int[2];
          boolean playAgain=true;
          while (playAgain) {
            playAgain=numberGame(num,res);
            
          }

            System.out.println("your total attemps:\t"+res[0]+"\t and you won rounds are :\t"+res[1]);

    }
}
