package exchange;

import java.io.*;
import java.util.*;

public class Command {
    public static void main(String[] args) throws IOException {
        Exchange exchange = new Exchange();
        
        // Read from ExchangeList.txt
        BufferedReader br = new BufferedReader(new FileReader("D:/eclipse/Lab6/java/ExchangeList.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/eclipse/Lab6/java/ThaiBaht.txt"));
        
        String line;
        double total = 0;
        
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            
            String[] parts = line.split("\\s+");
            double amount = Double.parseDouble(parts[0]);
            String currency = parts[1];
            
            double result = 0;
            
            if (currency.equals("USD")) {
                result = exchange.exchangeUSD(amount);
            } else if (currency.equals("EURO")) {
                result = exchange.exchangeEURO(amount);
            } else if (currency.equals("YEN")) {
                result = exchange.exchangeYEN(amount);
            } else if (currency.equals("POUND")) {
                result = exchange.exchangePOUND(amount);
            }
            
            bw.write(String.format("%.2f", amount) + " " + currency + " = " + 
                     String.format("%.2f", result) + " Baht\n");
            
            total += result;
        }
        
        bw.write(">>> Summation = " + String.format("%.2f", total) + " Baht\n");
        
        br.close();
        bw.close();
        
        System.out.println("Conversion completed. Results saved to ThaiBaht.txt");
    }
}