package week3;
/*
 * Write a java program input seller id, sellers name, sales amount, and basic salary
 * then fined this sales
 * Commission
 * Sales amount &gt;= 50,000 35%
 * Sales amount &gt;= 30,000 20%
 * &gt;= 20,000 10%
 * &gt;= 10,000 5%
 * &lt; 10,000 2%
 */

import java.util.Scanner;

public class Programme7_SalesCommission {
    public static void main(String[] args) {
        //Scanner declartion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Seller Id: ");
        int sellerid = scanner.nextInt();
        System.out.println("Enter Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary: ");
        int basicSalary = scanner.nextInt();
        //Creating the object to call instance method
        Programme7_SalesCommission salesCommission = new Programme7_SalesCommission();
        int grossSalary = basicSalary + salesCommission.calculateCommision(salesAmount);
        System.out.println("Seller name is           : " +name);
        System.out.println("Seller id is             : " +sellerid);
        System.out.println("Seller's sales amount is : " +salesAmount);
        System.out.println("Seller's basic salary is : " +basicSalary);
        System.out.println("Seller's gross salary is : " +grossSalary);
        //closing the scanner object
        scanner.close();
    }
    //Calculating the sales commission
    public int calculateCommision (int salesAmount){
        int commision;
        if (salesAmount >= 50000){
            commision = (salesAmount * 35) / 100;
            System.out.println("Sales Commision is " +commision);
        }if (salesAmount >= 30000){
            commision = (salesAmount * 20) / 100;
            System.out.println("Sales Commision is " +commision);
        } if (salesAmount >= 20000){
            commision = (salesAmount * 10) / 100;
            System.out.println("Sales Commision is " +commision);
        } if (salesAmount >= 10000){
            commision = (salesAmount * 5) / 100;
            System.out.println("Sales Commision is " +commision);
        } else {
            commision = (salesAmount * 2) / 100;
            System.out.println("Sales Commision is " +commision);
        }
        return commision;
    }
}
