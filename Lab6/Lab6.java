import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Student{
String RegNo;
String Name;
String Email;
String Phone;
String Class;
String Department; 


Student(String regno,String name,String mail,String phone,String clas,String dept){
this.RegNo=regno;
this.Name=name;
this.Email=mail;
this.Phone=phone;
this.Class=clas;
this.Department=dept; 
    
}
void printDetails(){
    System.out.println("Reg no:"+RegNo);
    System.out.println("Name:"+Name);
    System.out.println("Email:"+Email);
    System.out.println("Phone:"+Phone);
    System.out.println("Class:"+Class);
    System.out.println("Department:"+Department);
}
boolean search(String name,String regno){
boolean result=(Name.equalsIgnoreCase(name))&&(RegNo.equalsIgnoreCase(regno));
if(result){
    printDetails();
}
return result;
}
}
public class  Lab6{
   

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        Student[] Stdetails=new Student[100];
        int ch; 
        int count=0;

        
        do{
            System.out.println("Enter 1:to add student,2:search for a student,3:display details,4:to end the program");
            
            ch=Integer.parseInt(scan.nextLine());
            

            switch(ch){
 case 1:
                System.out.println("Enter the Reg no:");
                 String regno=scan.nextLine();
        
                System.out.println("Enter your name");
                String name=scan.nextLine();
        
                System.out.println("Enter your email");
                String mail=scan.nextLine();
        

                System.out.println("Enter your phone number");
                String phone=scan.nextLine();
       
                System.out.println("Enter your class");
                String clas=scan.nextLine();
        
                System.out.println("Enter your Department");
               String dept=scan.nextLine();
               Stdetails[count]=new Student(regno,name,mail,phone,clas,dept);
                 String filename=name+".txt";
        try{
    File file=new File(filename);
    
    FileWriter write=new FileWriter(file,true);
    write.write("\nRegNo: "+regno);
    write.write("\nName: "+name);
    write.write("\nEmail: "+mail);
    write.write("\nPhNo: "+phone);
    write.write("\nClass: "+clas);
    write.write("\nDepartment: "+dept);
   
    write.close();
        }
        

        
    catch(Exception ex){
            System.out.println(ex.getMessage());
        }
              // Stdetails[count]=new Student(regno,name,mail,phone,clas,dept);
                
                count+=1;
                break;

                case 2:
                System.out.println("Enter the regno of the student you want to search");
                String reg=scan.nextLine();
                System.out.println("Enter the name of the student you want to search");
                String name1=scan.nextLine();
                boolean found=false;
 for(int i=0;i<count;i++){
                    if(Stdetails[i].search(name1,reg))
                  {
                    found=true;
                    break;
                }}
                if(!found){
                    System.out.println("Student not found");

                }break;
                
                case 3:
                for(int i=0;i<count;i++){
                    Stdetails[i].printDetails();
                }
                break;

                case 4:
                System.out.println("end");
                break;  
            }
           }
           while(ch!=4);
           

    
    }

}
        
    