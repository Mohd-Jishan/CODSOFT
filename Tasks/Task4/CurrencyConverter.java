package Tasks.Task4;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter currency code you want to convert from e.g INR");
        String baseCurr=input.nextLine().toUpperCase();
        System.out.println("enter currency code you want to convert into e.g USD");
        String targetCurr=input.nextLine().toUpperCase();
        double exchangeRate=getExchangeRate(baseCurr,targetCurr);
        if(exchangeRate==-1){
            System.out.println("you entered a invalid currency try again");
        }
        else{
        System.out.println("enter amount to exchange");
        double amount =input.nextDouble();
        if(amount<=0){
            System.out.println("enter a valid amount");
           
        }else
        System.out.printf("your amount from %s to %s will be %.2f",baseCurr,targetCurr,amount*exchangeRate);
        }
        


    }

    private static double getExchangeRate(String baseCurr, String targetCurr) {
        
       try
       {
        String url="https://v6.exchangerate-api.com/v6/a362a8f3e7228d27d3d4cd21/latest/"+baseCurr;
       HttpRequest request=HttpRequest.newBuilder(URI.create(url)).GET().build();
       HttpClient client=HttpClient.newHttpClient();
       HttpResponse<String> response=client.send(request, BodyHandlers.ofString());
       String json=response.body();
       double  exchangerate=Double.parseDouble(json.split("\""+targetCurr+"\":")[1].split(",")[0]);

       return exchangerate;
       }
       catch(Exception e){
        // e.printStackTrace();
       }
        return -1;
      

    }
    
}
