/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonenumbervalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Levi Snyder
 */
public class PhoneNumberValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Pattern p = Pattern.compile(".?([0-9]{3})[-).].*([0-9]{3})[-.]([0-9]{4})"); //Pattern to check if the numbers are in proper format
        String[] phoneNumbers = new String[] {"(419)123-4567", "419.123.4567", "(419) 123-4567", "419-123-4567",
                                              "419_123_4567", "(419)123-456", "4191234567", "419123456"};
        PhoneNumberValidation validator = new PhoneNumberValidation(); 
        
        validator.ValidateNumber(phoneNumbers, p); //Starts the validation process
    }
}
