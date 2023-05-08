
import java.io.*;
import java.util.*;

public class Lab7 {
    
    public static void main(String[] args){
        String[][] arr = new String[1024][6];
        int n=0;
        try{
            File file=new File("iris.csv");
            Scanner scan=new Scanner(file);
            while(scan.hasNextLine()){
                String s = scan.nextLine();
               // System.out.println(scan.nextLine());
               arr[n] =s.split(",");
               n++;
                
                }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
    
        }
        float[] seplen = new float[n];
        //
        for(int i = 0; i < n; i++){
        seplen[i] = Float.parseFloat(arr[i + 1][1]);
        }
       

}
public static void mean(){



}
public static void  median(){


}

public static void mode(){


}


}
