
import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         //int choice;
         while (true) {
            System.out.println("Enter 1 for encryption , 2 for decryption and 3 to exit:");
            int c=scanner.nextInt();
         
         
         if (c == 1) {
            System.out.print("Enter message to encrypt: ");
            scanner.nextLine();
            String message = scanner.nextLine();
            String encMessage = encrypt(message);
            System.out.println("Encrypted message: " + encMessage);
        } else if (c == 2) {
            System.out.print("Enter message to decrypt: ");
            scanner.nextLine();
            String message = scanner.nextLine();
            String decryptedMessage = decrypt(message);
            System.out.println("Decrypted message: " + decryptedMessage);
        } else if (c == 3) {
            break;
        } else {
            System.out.println("Invalid option. Please choose again.");
        }
    }
       
}
    public static String encrypt(String message){

    String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String str2="XYZABCDEFGHIJKLMNOPQRSTUVW";
    StringBuilder encMessage = new StringBuilder();
   // String encryptedMessage = "";
    for(int i=0;i<message.length();++i){
        
        char ch = message.charAt(i);
        int index = str1.indexOf(Character.toUpperCase(ch));
        if (index >= 0) {
            char encryptedChar = str2.charAt(index);
            if (Character.isLowerCase(ch)) {
                encMessage.append(Character.toLowerCase(encryptedChar));
            } else {
                encMessage.append(encryptedChar);
            }
        } else {
            encMessage.append(ch);
        }

        // if () {
        //     char encryptedChar = str2.charAt(Character.toUpperCase(ch) - 65);
        //     if (Character.isLowerCase(ch)) {
        //         encryptedMessage += Character.toLowerCase(encryptedChar);
        //     } else {
        //         encryptedMessage += encryptedChar;
        //     }
        // } else {
        //     encryptedMessage += ch;
        // }

    }
    return encMessage.toString();
   
    }

    public static String decrypt(String message) {
        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str2 = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        StringBuilder decryptedMessage = new StringBuilder();
        
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            int index = str2.indexOf(Character.toUpperCase(ch));
            if (index >= 0) {
                char decryptedChar = str1.charAt(index);
                if (Character.isLowerCase(ch)) {
                    decryptedMessage.append(Character.toLowerCase(decryptedChar));
                } else {
                    decryptedMessage.append(decryptedChar);
                }
            } else {
                decryptedMessage.append(ch);
            }
        }
        return decryptedMessage.toString();
       
}

}
    
