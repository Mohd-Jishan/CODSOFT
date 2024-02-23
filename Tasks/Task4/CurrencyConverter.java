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
        //taking input from user a string that should be a currency code for a country from we want to convert
        System.out.println("enter currency code you want to convert from e.g INR");
        String baseCurr=input.nextLine().toUpperCase();
        //taking input from user a string that should be a currency code for a country to which we want to convert
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
        //creating a request we want to send to the httpserver for a currency exchangerate
       HttpRequest request=HttpRequest.newBuilder(URI.create(url)).GET().build();
       //create a Httpclient by which we can request an api or httpserver request
       HttpClient client=HttpClient.newHttpClient();
       //through Httpclient we fetch data from server
       HttpResponse<String> response=client.send(request, BodyHandlers.ofString());
       //fetched data is  in json formate converting into string
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
