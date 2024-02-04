package com.prog2.labs;
/**
 * @author adinashby
 *
 */
public class LabTwo {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
	public double calcAmountOfShipping(double costOfPurchase) {
		
                double shipping = 0;
                
                if (costOfPurchase <= 20.00)
                    shipping = 5.99;
                else if (costOfPurchase > 20.00 && costOfPurchase <= 65.00)
                    shipping = 10.99;
                else if (costOfPurchase > 65.00)
                    shipping = 15.99;
		
		return shipping;
	}
	
	
	public String findPrimeNumbersUptoInput(int input) {
                
                 int i;
                 int j;
                 String results = "";
                 boolean isPrime = true;
                 for (i = 2; i <= input; i++) {
                     
                     for (j = 2; j < i; j++){
                         
                         if (i % j == 0){    // i is not a prime number
                            isPrime = false;
                         }
                         
                         
                         }
                        if (isPrime){
                            String stringI = Integer.toString(i);
                            results = results + " " + stringI;
                        }
                         isPrime = true;
                     }
               
                    return results.trim();
             
        }

	
	
	public String generateShape(int numberOfRows) {
		
            int line = 1;
            int number = 1;
            int lengthOfLine = 1;
            String results = "";
            
            for (line = 1; line <= numberOfRows; line++) {
                
                for (lengthOfLine = 1; lengthOfLine <= line; lengthOfLine++) {
                    String stringI = Integer.toString(number);
                    results = results + stringI + " ";
                    number++;
                }
                if (line < numberOfRows){
                    results = results.trim() + "\n";
                }
                
            }
		return results.trim();
	}
	
	/**
	 * 4) Complete the Account class (see inside the class for instruction). 
	 * 
	 */

}
