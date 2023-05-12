package Lab1;
import java.util.Scanner;
public class Lab1{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name:");
        String Name=scan.nextLine();
       System.out.println("Enter the gender-m/f:");
        char Gender=scan.next().charAt(0);
        scan.nextLine();
        System.out.println("Enter the company name:");
        String Company=scan.nextLine();
        System.out.println("Enter the state name:");
        String State=scan.nextLine();
        System.out.println("******************************************");
        System.out.println("Employee Name:"+Name);
        if(Gender=='f'){
            System.out.println("Employee gender:FEMALE");  
        }
        else if(Gender=='m'){
            System.out.println("Employee gender:MALE");
        }
        System.out.println("Employee State:"+State);
        System.out.println("Employee company:"+Company.toUpperCase());
        switch(Company.toLowerCase()){
            case "facebook":
            case  "google":
            case "microsoft":
            case "samsung":
            case "ibm":
            case "apple":
            System.out.println("The employee is working in Top MNC Companies");
            break;
            default:
            break;
        }
    
        switch(State.toLowerCase()){
            case "kerala":
            case "tamil nadu":
            case "karnataka":
            case "telangana":
            case "andhra pradesh":
            System.out.println("The Employee is from the southern states of India;\nPreferable work location is in  Andhra Pradesh,Karnataka,\n Kerala, Tamil Nadu and Telangana");

        }
        switch(State.toLowerCase()){
            case "jammu and kashmir":
            case "himachal Pradesh":
            case "punjab":
            case  "uttarakhand":
            case "haryana":
            case "delhi":
            case "rajasthan":
            case "uttar pradesh":
            case "chandigarh":
            System.out.println("The Employee is from the northern states of India; \nPreferable work location is in Jammu & Kashmir, Himachal Pradesh,\n Punjab, Uttarakhand, Haryana, Delhi, Rajasthan and Uttar Pradesh and Chandigarh.");
        }
        switch(State.toLowerCase()){
            case "nagaland":
            case "manipur":
            case "meghalaya":
            case "tripura":
            case "arunachal pradesh":
            case "assam":
            case "mizoram":
            case "sikkim":
            case "bihar":
            case "jarkhand":
            case "orissa":
            System.out.println("The Employee is from the western states of India;\n Preferable work location is incase nagaland, manipur, meghalaya,\ntripura,arunachal pradesh,assam,mizoram,sikkim,bihar,jarkhand,orissa"); 
        }
        switch(State.toLowerCase()){
        case "gujarat":
        case "rajasthan":
        case "goa":
        case "west bengal":
        
        System.out.println("The Employee is from the eastern states of India;\n Preferable work location is in gujarat , rajasthan ,goa ,west bengal");
        }
        System.out.println("******************************************");
        
        }



    }
