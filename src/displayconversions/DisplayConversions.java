package displayconversions;

import java.util.Scanner;
/**
 *@author Robert Holahan
 * 
 */
public class DisplayConversions {
    
    public void DisplayConversions() {        
    }
    
    public static void InputInches() {
        Scanner input = new Scanner(System.in);
        double measurement = -1;
        
        System.out.print("Enter your measurement in Inches :");
        
        while (measurement < 0) {
            
            try {                
                measurement = Double.parseDouble(input.nextLine());
                if (measurement > 0) {
                    System.out.println("Your measurement of inches "
                            + measurement + " converts to "
                            + MeasurementConversions.InchesToCentimeters(measurement)
                            + " centimeters.");
                    System.out.println();
                } else {
                    
                    System.out.print("Enter a positive number: ");
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                
                System.out.print("Please enter a positive numeric value: ");
                System.out.println();
            }           
        }
    }

    public static void InputCentimeters(){
        Scanner input = new Scanner(System.in);
        double measurement = -1;
        
        System.out.print("Enter your measurement in Centimeters :");
        
        while (measurement < 0) {
            
            try {                
                measurement = Double.parseDouble(input.nextLine());
                if (measurement > 0) {
                    System.out.println("Your measurement of centimeters "
                            + measurement + " converts to "
                            + MeasurementConversions.CentimetersToInches(measurement)
                            + " inches.");
                    System.out.println();
                } else {
                    
                    System.out.print("Enter a positive number: ");
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                
                System.out.print("Please enter a positive numeric value: ");
                System.out.println();
            }           
        }
    } 
    
    public static void InputKilos(){
        Scanner input = new Scanner(System.in);
        double measurement = -1;
        
        System.out.print("Enter your weight to convert in kilos :");
        
        while (measurement < 0) {
            
            try {                
                measurement = Double.parseDouble(input.nextLine());
                if (measurement > 0) {
                    System.out.println("Your weight of " + measurement + 
                            " kilos converts to "
                            + MeasurementConversions.KilosToLbs(measurement)
                            + " pounds.");
                    System.out.println();
                } else {
                    
                    System.out.print("Enter a positive number: ");
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                
                System.out.print("Please enter a positive numeric value: ");
                System.out.println();
            }           
        }    
    }
    
    public static void InputLbs(){
        Scanner input = new Scanner(System.in);
        double measurement = -1;
        
        System.out.print("Enter your weight to convert in pounds : ");
        
        while (measurement < 0) {
            
            try {                
                measurement = Double.parseDouble(input.nextLine());
                if (measurement > 0) {
                    System.out.println("Your weight of " + measurement 
                            + " pounds converts to "
                            + MeasurementConversions.LbsToKilos(measurement)
                            + " kilos.");
                    System.out.println();
                } else {
                    
                    System.out.print("Enter a positive number: ");
                    System.out.println();                    
                }
            } catch (NumberFormatException e) {
                
                System.out.print("Please enter a positive numeric value: ");
                System.out.println();
            }           
        }        
    }
    
    public static void InputLbsTest(){
        Scanner input = new Scanner(System.in);
        double measurement = -1;
        
        System.out.print("Enter your weight to convert in pounds : ");
        
        while (measurement < 0){
            String myInput = input.nextLine();
            if (TestInput(myInput) == true ){
                measurement = Double.parseDouble(myInput);
                System.out.println("Your weight of " + measurement 
                        + " pounds converts to "
                        + MeasurementConversions.LbsToKilos(measurement)
                        + " kilos.");
                System.out.println();
            }                           
        }        
    }
        
    public static boolean TestInput(String Input){
            double testValue;
        try {
            testValue = Double.parseDouble(Input);                             
        }
        catch (NumberFormatException e){
            System.out.print("Enter a positive number: ");                                            
            return false;                
        }
        if(testValue > 0){
            return true;
        }
        else{
            System.out.print("Enter a positive number: ");                                
            return false;
        } 
                
                
    }
}
