
import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         //int choice;
         System.out.println("Enter 1 for encryption and 2 for decryption:");
         int choice=scanner.nextInt();
         switch(choice){

         case 1:

        //Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message to encrypt: ");
        
        String message = scanner.nextLine();
        String encryptedMessage = encrypt(message);

        System.out.println("Encrypted message: " + encryptedMessage);
        break;
        case 2:
        System.out.print("Enter message to decrypt: ");
        String message2 = scanner.nextLine();
        String decryptedMessage = encrypt(message2);

        System.out.println("Encrypted message: " + decryptedMessage);
    }
}
    public static String encrypt(String message){

    String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String str2="XYZABCDEFGHIJKLMNOPQRSTUVW";
    String encryptedMessage = "";
    for(int i=0;i<message.length();++i){
        
        char ch = message.charAt(i);
        if () {
            char encryptedChar = str2.charAt(Character.toUpperCase(ch) - 65);
            if (Character.isLowerCase(ch)) {
                encryptedMessage += Character.toLowerCase(encryptedChar);
            } else {
                encryptedMessage += encryptedChar;
            }
        } else {
            encryptedMessage += ch;
        }

    }
    return encryptedMessage;



        
    }
    public static String decrypt(String encryptedMessage) {
        String cipher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String decryptedMessage = "";
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char ch = encryptedMessage.charAt(i);
            if (Character.isLetter(ch)) {
                char decryptedChar = (char) (cipher.indexOf(Character.toUpperCase(ch)) + 65);
                if (Character.isLowerCase(ch)) {
                    decryptedMessage += Character.toLowerCase(decryptedChar);
                } else {
                    decryptedMessage += decryptedChar;
                }
            } else {
                decryptedMessage += ch;
            }
        }
        return decryptedMessage;
}

}
    
