package banking;

import java.util.*;
public class BankDetails {
	
	private String accno;  
    private String name;    
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();   
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance : ");  
        balance = sc.nextLong();  
        if(balance < 1000) {
        	System.out.println("Minimum balance should be 1000.");
        	System.out.println("Again enter the minimum balance: ");
        	balance=sc.nextLong();
        }
    }  
     
    public void showAllAccount() {  
        System.out.println("Name of account holder: " + name); 
        System.out.println("Account number of customer: " +accno);
        System.out.println("Balance: " + balance);  
    } 
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);     
        System.out.println("Balance: " + balance);  
    }  
     
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt; 
        Random r = new Random();
        Transaction t = new Transaction(r.nextInt(), accno,amt, "deposit",balance);
        TransactionDetails.addTransaction(t);
        System.out.println("Balance after deposite money is "+balance+" transaction stored.");
    }  
    
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong(); 
        Random r =new Random();
        if (balance-1000 >= amt) {  
            balance = balance - amt;  
            Transaction t = new Transaction(r.nextInt(), accno,amt, "withdraw",balance);
	        TransactionDetails.addTransaction(t);
            System.out.println("Balance after withdrawal money is : " + balance+" transaction stored.");  
        } else {  
        	balance=balance-1000;
            System.out.println("Your withdrawal amount is higher than "+balance+" \tTransaction failed...!!" );  
        }  
    }  
      
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}
