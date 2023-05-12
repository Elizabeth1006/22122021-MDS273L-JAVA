
import java.util.Scanner;


public class Lab4 {
    private static int accountNumber;
    private static String accHolderNam;
    private static double accBalance;
    Scanner scanner = new Scanner(System.in);
    public static void initializeCustomer(int accno, String acchlodName,double accbal){
        accountNumber=accno;
        accHolderNam=acchlodName;
        accBalance=accbal;
       Scanner scanner = new Scanner(System.in); 
    }
    public static void deposit(){
        //double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:") ;
     double depamount=Double.parseDouble(scanner.nextLine());
        accBalance=accBalance+depamount;
        System.out.println("Balance:"+accBalance);
    }
    public static void withdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw:") ;
        double withamount=Double.parseDouble(scanner.nextLine());
        if(withamount>accBalance){
            System.out.println("Not sufficient amount..");  
        }else{
           accBalance-=withamount; 
        System.out.println("Balance:"+accBalance);
        }

    }
    public static void transactions(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of transactions: ");
        int numTransactions = Integer.parseInt(scanner.nextLine());
    
        int transactionCount = 1;
        while (transactionCount <= numTransactions) {
            System.out.println("Transaction #" + transactionCount + " - Enter D for deposit or W for withdrawal: ");
            String transactionType = scanner.nextLine();
            if (transactionType.equalsIgnoreCase("D")) {
                deposit();
            } else if (transactionType.equalsIgnoreCase("W")) {
                withdraw();
            } else {
                System.out.println("Invalid ");
                continue;
            }
    
            transactionCount++;
        }

    }
    public static void accountsummary(){

    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        initializeCustomer(123,"Elizabeth",200000);
        
        // Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the choice:\n1-Deposit:\n2-Withdraw:\n3-Transactions:\n4-Account Summary:");
        int option=scanner.nextInt();
        
        

      
        
        System.out.println("Option:"+ option);
        switch(option){
            case 1:
           
        
            deposit();
            break;
            case 2:
        
       
            withdraw();
            break;
          case 3:
          transactions();
          break;
           case 4:
           accountsummary();
           break;
        
}
}}