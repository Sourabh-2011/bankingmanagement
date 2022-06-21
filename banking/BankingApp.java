package banking;

import java.util.*;

public class BankingApp {
	public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);    
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankDetails();  
            C[i].openAccount();  
        }  
       
        int ch;  
        do {  
            System.out.println("\n Welcome to Banking System ");  
            System.out.println("1.  Display the list of customers of the bank \n 2. Check the balance \n 3.Deposite money  \n 4. Withdraw money \n 5.Close \n 6. Transaction details ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAllAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account number you want to check the balance for : ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
			System.out.println("Enter the account number to get the transaction details: ");
                    	ac_no=sc.next();
                    	TransactionDetails.showMiniStatement(ac_no);
				break;
                        
                    case 6:
                    	System.out.println("Bank is Closed");  
                        break;
                }  
            }  
            while (ch != 6);  
        }  
}
