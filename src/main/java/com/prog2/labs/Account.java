package com.prog2.labs;
/**
 * @author adinashby
 *
 */
public class Account {
	
	/**
	 * i) Define three instance variables called accountNumber, name and amount.
	 */
	
         int accountNumber;
         String name;
         double amount;
    
	/**
	 * ii) Define one static variable called numberOfAccounts.
	 */
	
         static int numberOfAccounts;  
         
	/**
	 * Write your test code below in the main (optional).
	 */
	
	public static void main(String[] args) {
            
            Account firstAccount = new Account();
                firstAccount.accountNumber = 12345;
                firstAccount.name = "Marie";
                firstAccount.amount = 1500.0;
                
            System.out.println(firstAccount.toString());
            
	}
	
	/**
	 * iii) A default constructor.
	 */
	public Account() {
            this.accountNumber = 0;
            this.name = "";
            this.amount = 0;
            
        }
        
        
	/**
	 * iv) A constructor that takes all the parameters and initializes them 
	 */
        
	
	public Account(int accountNumber, String name, double amount) {
            
            this.accountNumber = accountNumber;
            this.name = name;
            this.amount = amount;
		
	}
	
	/**
	 * v) Getters and setters (accessors and mutators).
	 */
	
        public int getAccountNumber () {
        return this.accountNumber;
    }
    
        public void setAccountNumber (int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }
        public String getName () {
        return this.name;
    }
    
    public void setName (String newName) {
        this.name = newName;
    }
    
         public double getAmount () {
        return this.amount;
    }
    
    public void setAmount (double newAmount) {
        this.amount = newAmount;
    }
	/**
	 * vi) Adds the parameter value to the amount field.
	 * 
	 * @param amountToBeDeposited a positive number.
	 *
	 * @return result new value.
	 */
	public double deposit(double amountToBeDeposited) {
            
            this.amount = amount + amountToBeDeposited;
		return amount;
                
	}
	
	/**
	 * vii) Subtracts the parameter value from the amount field.
	 * 
	 * @param amountToBeWithdrawn a positive number.
	 *
	 * @return result new value.
	 */
	public double withdraw(double amountToBeWithdrawn) {
		
           this.amount = amount - amountToBeWithdrawn; 
            return amount;
	}
	
	/**
	 * viii) Adds %2 interest to the amount field.
	 *
	 * @return result new value.
	 */
	public double calculateInterest() {
            
            double interest = amount * .02;
		return amount + interest;
	}
	
	/**
	 * ix) To show the values inside the object .
	 *
	 * @return result the string containing the values.
	 */
	public String toString() {
         
            return String.format("Account Number: %02d, Name: %s, Amount: %f", accountNumber, name, amount);   
        }
	
	/**
	 * x) To compare if two instances of Account class are equal or not.
	 *
	 * @param anotherAccount another instance of the Account class.
	 *
	 * @return result the string containing the values.
	 */
	public boolean equals(Account anotherAccount) {

            boolean isEqual = true;
            
            if(this.accountNumber != anotherAccount.accountNumber)
                isEqual = false;
            
            if(this.amount != anotherAccount.accountNumber)
                isEqual = false;
            
            if (this.name != anotherAccount.name)
                isEqual = false;
            
            return isEqual;
     
        }
	}

