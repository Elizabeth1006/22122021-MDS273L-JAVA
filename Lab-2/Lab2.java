
import java.util.Scanner;

public class Lab2 {
  static Scanner sc = new Scanner(System.in);
  static String[] names = new String[1024];
  static int count = 0;

  public static void main(String[] args) {
    int option;
    do {
      System.out.println("**************************************************");
     System.out.println("Menu:\n 1. Enter a name \n2. Search for a name \n3. Remove a name\n4. Exit");
     System.out.println("**************************************************");
        option = sc.nextInt();
      switch (option) {
        case 1:
          addName();
          break;
        case 2:
          searchName();
          break;
        case 3:
          removeName();
          break;
          case 4:
          System.out.println("Exiting program...");
          break;
        default:
          System.out.println("Invalid option!");
          break;
      }
    } while (option != 4);
  }


  static void addName() {
    System.out.print("Enter a name: ");
    String name = sc.next();
    if (isNameExists(name)) {
      System.out.println("Name already exists");
    } else {
      names[count++] = name;
      System.out.println("Name added ...!");
    }
  }
  static void searchName() {
    System.out.print("Enter a name to search: ");
    String name = sc.next();
    boolean isFound = false;
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        System.out.println("Name is there...");
         isFound = true;
        break;
      }
    }
    if (!isFound) {
      System.out.println("Not found.");
    }
  }

  static void removeName() {
    System.out.print("Enter a name to remove: ");
    String name = sc.next();
    boolean isFound = false;
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        for (int j = i; j < count - 1; j++) {
          names[j] = names[j + 1];
        }
        count--;
        System.out.println("Name removed!");
        isFound = true;
        break;
      }
    }
    if (!isFound) {
      System.out.println("Not found.");
    }
  }

  static boolean isNameExists(String name) {
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        return true;
      }
    }
    return false;
}
}
