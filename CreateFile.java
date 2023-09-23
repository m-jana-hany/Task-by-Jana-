/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileTask;
import  java.io.File;
import  java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class CreateFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
try {
      File myObj = new File("users.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
addUser();

    }
    
    public static void addUser(){
        Scanner username = new Scanner (System.in);
        System.out.println("enter ur username");
      String usrnm =  username.next();
       Scanner pass = new Scanner (System.in);
               System.out.println("enter ur password");
      String passwrd =  username.next();
    try {
     FileWriter writer = new FileWriter("users.txt");
     writer.write("ur username is: " + usrnm);
     writer.append("ur password is: " +passwrd);
     writer.close();
      }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    
}
