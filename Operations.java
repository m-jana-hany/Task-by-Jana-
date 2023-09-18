/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Final;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Operations {

    
  static public float calcs(float x, float y, float res){
      
     
   Scanner no1 = new Scanner(System.in);
   System.out.println(("Enter first num"));
   x = no1.nextFloat();
   
    Scanner no2 = new Scanner(System.in);
   System.out.println(("Enter sec num"));
   y = no2.nextFloat();
   
   Scanner oper = new Scanner(System.in);
   System.out.println("Choose the desired operation to be excuted '+','-','*','/','%'");
      char opr = oper.next().charAt(0);
     
      switch(opr){
      case'+': 
          res = x + y;
          System.out.println(x +" + " + y + " = "+ res);
          break;
         
      case'-': 
          res = x - y;
          System.out.println(x +" - " + y + " = "+res);
          break;
      case'*': 
          res = x * y;
          System.out.println(x +" * " + y + " = "+res);
          break;
          
       case'/': 
          res = x / y;
          System.out.println(x +" / " + y + " = "+res);
                    break;
       case'%': 
          res = x % y;
          System.out.println(x +" % " + y + " = "+res);
          break;
       default : 
           System.out.println("Enter valid value") ; 
         break;
      }
      
        
     
       Scanner walkOrNo = new Scanner(System.in);
      System.out.println("U wanna make robot walk? pls Write 'yes' or 'no' ");
      String step = walkOrNo.next();
     switch(step){
         case "yes":
             return res+2;
            
         case "no": 
             System.out.println("Finished.") ;
              break;
            default:    
                System.out.println("Enter valid value") ;  
             break;
             
     }
      return 0;

      
    }
  

    static public float walk(float res){
       return res+2;
    }
            
            
            }
