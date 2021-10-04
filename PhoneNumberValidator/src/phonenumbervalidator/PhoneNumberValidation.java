/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonenumbervalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lsnyder
 */
public class PhoneNumberValidation 
{
    public void ValidateNumber(String[] phoneNumbers, Pattern p)
    {
        for(String phoneNumber: phoneNumbers)
        {
            IsMatch(phoneNumber, p);
        }
    }
    
    public static void IsMatch(String phoneNumber, Pattern p) 
    {
        Matcher match = p.matcher(phoneNumber);
        DisplayResults(match.matches(), phoneNumber, match);
    }
    
    public static void DisplayResults(boolean validated, String phoneNumber, Matcher match)
    {
        if(validated)
        {
            System.out.println("(" + match.group(1) + ") " + match.group(2) + "-" + match.group(3) + " is a valid phone number.");
            //Display correct fomat
        }

        else
        {
            System.out.println("The phone number " + phoneNumber + " is not a valid phone number, try typing in this format (###) ###-####.");
        }
    }
}
