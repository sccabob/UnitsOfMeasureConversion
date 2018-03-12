package displayconversions;

import java.util.Scanner;
/*
 *Robert Holahan
 */
public class DisplayConversions {
    
    public void DisplayConversions() {        
    }
    
    public static void convertInchesToCentimeters(){
        //Gather and validate user input
        double measurement =
        getUserInput("Pounds", "Enter your measurement in Inches : ");
        
        //Output to user
        System.out.println("Your measurement of " + measurement 
                + " inches converts to "
                + MeasurementConversions.inchesToCentimeters(measurement)
                + " centimeters.");
        System.out.println();        
    }
    
    public static void convertCentimetersToInches(){
        //Gather and validate user input
        double measurement =
        getUserInput("Pounds", "Enter your measurement in Centimeters : ");

        //Output to user
        System.out.println("Your measurement of " + measurement 
                +" centimeters converts to "
                + MeasurementConversions.centimetersToInches(measurement)
                + " inches.");
        System.out.println();        
    }
   
    public static void convertKilosToPounds(){
        //Gather and validate user input
        double measurement =
        getUserInput("Pounds", "Enter your weight to convert in kilos : ");
        
        //Output to user        
        System.out.println("Your weight of " + measurement + 
            " kilos converts to "
            + MeasurementConversions.kilosToLbs(measurement)
            + " pounds.");
        System.out.println();   
    }
       
    public static void convertPoundsToKilos(){
        //Gather and validate user input
        double measurement =
        getUserInput("Pounds", "Enter your weight to convert in pounds : ");
        
        //Output to user
        System.out.println("Your weight of " + measurement 
                + " pounds converts to "
                + MeasurementConversions.lbsToKilos(measurement)
                + " kilos.");
        System.out.println();
    }
    
    public static void convertCiTocc(){
        //Gather and validate user input
        double measurement =
        getUserInput("Pounds", "Enter your volume to convert in cubic inches : ");

        //Output to user
        System.out.println("Your volume of " + measurement 
                + " cubic inches converts to "
                + MeasurementConversions.cubicInchesToCc(measurement)
                + " cubic centimeters.");
        System.out.println();
        
    }
       
    private static double getUserInput(String UnitOfMeasure, String Prompt) {
        
        Scanner input = new Scanner(System.in);            
        boolean validInput = false;
        String userInput = "";
        
            while (validInput == !true) {           
            System.out.print(Prompt);
            userInput = input.nextLine();
            validInput = testInput(userInput);                   
            }
            
           return Double.parseDouble(userInput);
    }
    
    private static boolean testInput(String Input){
        
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
