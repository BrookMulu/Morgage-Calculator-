/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elijahbrookfinalproject;
import javax.swing.JButton;
import java.util.ArrayList;
/**
 * @author Brook 
 * @author Grover
 * This class performs the calculations for interest expense, decrease in carrying value and
 * new carrying value.
 */
public class Calculations extends JButton
{
/*
* The following variables define the properties and neccessary inputs for the morgage calculator. 
*/
    public double interestRate;
    public double purchasePrice;
    public double mortgage;
    public double paymentsPerYear;
    public double startMonth;
    public double startDay;
    public double startYear;
    public double cashPayment;
    public ArrayList<double[]> fullTable;
    public static double carryingValue;
    
    /*
    /*
    *@param apurchasePrice is purchase price of the house. 
    *@param aIntersetRate is the interset rate for the payments.
    *@param aMortgage is the number of years you are going to make the payments.
    *@param aPaymentsPerYer is the number of payments per year.
    *@param aStartMonth is the month the user starts the payment.
    *@param aStartDay is the day the user starts the payment.
    *@param aStartYear is the year the user starts the payment.
    *@Param aCashPayment is the amount you pay for each payment.
    */
    public Calculations(double aPurchasePrice, double aInterestRate, double aMortgage, double aPaymentsPerYear, double aStartMonth, double aStartDay, double aStartYear, double aCashPayment)
    {
        interestRate = aInterestRate;
        purchasePrice = aPurchasePrice;
        mortgage = aMortgage;
        paymentsPerYear = aPaymentsPerYear;
        startMonth = aStartMonth;
        startDay = aStartDay;
        startYear = aStartYear;
        cashPayment = aCashPayment;
        carryingValue = purchasePrice;
        
    }
    /*
    *This methods caluculates the interest expense.
    */
    public double calculateInterestExpense()
    {
        double interestExpense = (carryingValue * interestRate) * (1/paymentsPerYear);
        return interestExpense;
    }
    
    /*
    *This methods caluculates the decrease in carrying value.
    */
    public double calculateDecreaseInCarryingValue()
    {
        double decreaseInCarryingValue = cashPayment - calculateInterestExpense() ;
        return decreaseInCarryingValue;
    }
    /*
    *This methods caluculates the new carrying value.
    */
    public double calculateNewCarryingValue()
    {
        
        carryingValue = carryingValue - calculateDecreaseInCarryingValue();
        return carryingValue;
    }
    
    /*
    *This methods returns the a array list of all the calculations .
    */
    public ArrayList<double []> getCalculations()
    {
        return fullTable;
    }
    
    public void press()
    {
        calculateInterestExpense();
        calculateDecreaseInCarryingValue();
    }
    
            
}
