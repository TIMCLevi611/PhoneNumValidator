/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonenumbervalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Levi Snyder
 */
public class PhoneNumberValidation 
{
    /*
     * Checks if the list of phone numbers are valid numbers.
     */
    public void ValidateNumber(String[] phoneNumbers, Pattern p)
    {
        for(String phoneNumber: phoneNumbers) //For each loop to go through all of the numbers
        {
            IsMatch(phoneNumber, p);
        }
    }
    
    /*
     * Checks if the number matches the pattern then calls the display method
     */
    public static void IsMatch(String phoneNumber, Pattern p) 
    {
        Matcher match = p.matcher(phoneNumber); //If the number matches the pattern
        DisplayResults(match.matches(), phoneNumber, match); //Gives the stuff to be displayed.
    }
    
    /*
     * Displays the results of the numbers.
     */
    public static void DisplayResults(boolean validated, String phoneNumber, Matcher match)
    {
        if(validated) //If the number matches the pattern
        {
            System.out.println("(" + match.group(1) + ") " + match.group(2) + "-" + match.group(3) + " is a valid phone number.");
        }

        else //If the number doesn't match the pattern
        {
            System.out.println("The phone number " + phoneNumber + " is not a valid phone number, try typing in this format (###) ###-####.");
        }
    }
}
