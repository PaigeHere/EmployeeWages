/*
 * Author: Paige Margaret Bartusiak
 * Assignment: 3.3c
 * Date: September 20, 2018
 * 
 *ReadMe: This code takes user input to calculate an employee's total weekly pay.  
 */
import java.util.Scanner;

public class EmployeeWages{
   public static void main (String [] args){
     
    Scanner reader = new Scanner(System.in); //reader used for user input
    
    //Gets user input
    System.out.print("Enter hourly wage: ");
    double hourlyWage = reader.nextDouble();
    
    System.out.print("Enter the total regular hours: ");
    double regularHours = reader.nextDouble();
    
    System.out.print("Enter the overtime hours: ");
    double overtimeHours = reader.nextDouble();
    
    //performs calculations   
    double overtimePay = overtimeHours * 1.5 * hourlyWage;
    double weeklyPay = (double)hourlyWage * regularHours + overtimePay;
    

    //prints results
    System.out.println("The weekly pay for the employee is $" + weeklyPay);                                                                
  }
}
