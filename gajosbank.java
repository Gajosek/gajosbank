import java.io.IOException;
import java.util.Scanner;


public class gajosbank {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        System.out.println( "Welcome in GAJOS bank");
        System.out.println( "---------------------");
       
        // Logowanie      
        
        System.out.print("Please type your nick:");
      	Scanner read = new Scanner(System.in);
         String nick = read.nextLine();
        
        System.out.print("Please type your password:");
        String pass = read.nextLine();
        System.out.println( "Welcome " + nick);
        gajosbank obj = new gajosbank();
        obj.mainMenu();
    }
	
    //utworzenie metodu mainMenu
          public  void mainMenu() throws IOException{
        	  
        	  boolean  tomek = true;
              Account account = new   Account();
                       
      do{
    	
    	 System.out.println("1. View account balance");
         System.out.println("2. Deposit ");
         System.out.println("3. Withdraw");
         System.out.println("4. Logout");
         System.out.print("Enter Selection: ");
         Scanner read = new Scanner(System.in);	
         int selection = read.nextInt();
         
         switch(selection){
         
            case 1:
            account.getBalance(); 
            System.out.println("Account balance is " + account.getBalance() );
            //mainMenu();
            break;
            
            case 2:
//            Account  account = new Account();
            account.deposit();
            System.out.print("Account balance is " + account.deposit() );
            //mainMenu();
            break;
            
            case 3:
           // Account  account = new Account();
            account.withdraw();
            System.out.print("Account balance is " + account.withdraw() );
            //mainMenu();
            break;
            
            case 4:
            	
            	tomek = false;
           // Account  account3 = new Account();
           // account3.logOut();
            break;
        
         default:
            	System.out.println("!!please type proper selection!!");
            	//mainMenu();
            } 
      } while  ( tomek);
          }
           public class Account{
      
             double balance=100 ;   
            Scanner input = new Scanner(System.in);
          //metoda sprawdzanie stanu konta
          public  double  getBalance(){
            
               return balance;
        }
        //metoda wp³ata
        public  double  deposit( ) {
           System.out.print("Enter an amount to deposit:");
         
           double depositAmount = input.nextDouble();
          if (depositAmount < 0) {
          System.out.print("Invalid Amount!");
          }
          balance= balance + depositAmount;
           
         return 1;
        }
        // metoda wyp³ata
        public double withdraw() {
        System.out.println("Your Balance is: " + balance);
        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        if (withdrawAmount > balance) {
        System.out.println("You do not have a sufficient balance to withdraw this amount!");
        return 2;
        }
        if (withdrawAmount <= 0) {
        System.out.println("Invalid Amount!");
        return 1;
        }
        balance = balance - withdrawAmount;
        return 0;
            } 
         // metoda- wylogowanie z konta
            public   void logOut(){
        	
        	System.out.println("Thank You for your transaction");
            System.exit(0);
        }
        }
}
        
        

    

	



