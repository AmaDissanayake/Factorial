/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

public class Factorial {
    
    int Number;
    
    public static int CalculatingFactorial(int number){
        if (number ==0){                                      //If the user input is 0
            return 1;                                         //Return as 1
        }
        else{
            return number * CalculatingFactorial(number -1);  //Multiply by the user input number and (User input number - 1) and returning the value
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Factorial for number 3 is : "+CalculatingFactorial(3));
         System.out.println("Factorial for number 4 is : "+CalculatingFactorial(4));
 
    }   
}