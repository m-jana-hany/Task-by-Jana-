/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileTask;
import java.io.BufferedReader;
import java.io.IOException; 
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author Administrator
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
 Scanner crudSelect = new Scanner(System.in);
 System.out.println("Select from 'Create' , 'Update(insert)' , 'read (log in)' , 'delete'");
 String selected = crudSelect.next();
 
 switch (selected) {
 case "Create":
 try {
      File myObj = new File("crud.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
 break;
 case "Update" :
     addUser();
     break;
 case "read": 
     logInUser();
     break;
 case "delete":
     delete();
     break;
  default:
     System.out.println("pls enter valid input");
     break;
    
    }
    }
    
     public static void addUser(){
        Scanner username = new Scanner (System.in);
        System.out.println("enter ur username");
      String usrnm =  username.next();
       Scanner pass = new Scanner (System.in);
               System.out.println("enter ur password");
      String passwrd =  username.next();
    try {
     FileWriter writer = new FileWriter("crud.txt");
     writer.write("ur username is: " + usrnm);
     writer.append(" ur password is: " +passwrd);
     writer.close();
      }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
    
    }
     
      public static void logInUser()throws IOException {
        Scanner username = new Scanner (System.in);
        System.out.println("enter ur username");
      String usrnm =  username.next();
       Scanner pass = new Scanner (System.in);
               System.out.println("enter ur password");
      String passwrd =  username.next();
    
      boolean login = false;

   Path file =Path.of("crud.txt");
   String file1 = Files.readString( file);
    if(file1.indexOf( usrnm )!=-1) {
            login= true;
           
         }
     if(login) {
         System.out.println("U are Logged in now successfully.");
      } else {
         System.out.println("Log in failed");
      }
      }
        public static void delete() throws IOException {
            FileReader fileReader
            = new FileReader("crud.txt");
  
        BufferedReader buffReader = new BufferedReader(fileReader);
      
       String userInfo = buffReader.readLine();
     
       userInfo = userInfo.replaceAll(userInfo , "");
      System.out.println(userInfo);
fileReader.reset();
     

        }
}

