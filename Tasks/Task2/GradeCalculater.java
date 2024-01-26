package Tasks.Task2;

import java.util.*;

public class GradeCalculater {
    static  Scanner sc=new Scanner(System.in);
    public static String calculteGrade(int n){
        List<Integer> subjects=new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            System.out.println("enter subject"+i+"  Numbers");
            subjects.add(sc.nextInt());
        }
        int sum=0;
        for(Integer num:subjects){
                sum+=num;
        }
        System.out.print("your total Numbers: "+ sum+" out of "+ n*100+" and ");
        int grade=sum/n;
        if(grade>=90){
            return "A++";
        }else if(grade<90 && grade>=80){
            return "A+";

        }
        else if(grade<80 && grade>=70){
            return "A";
        }
        else if(grade<70 && grade>=55){
            return "B";
        }
        else if(grade<55 && grade>=45){
                return "C";
        }else if(grade<45 && grade>=35){
            return "D";
        }else
        return "Fail";
    } 
    public static void main(String[] args) {
            System.out.println("How many subjects do you have");
            int n=sc.nextInt();
            System.out.println("your grade is: " + calculteGrade(n));
        
    }
    
}
