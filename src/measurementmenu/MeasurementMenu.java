package measurementmenu;
import displayconversions.DisplayConversions;
import java.util.Scanner;
/**
 *@author Robert Holahan
 * 
 */
public class MeasurementMenu {

    
    public static void main(String[] args) {
        DisplayConversions.InputInches();
        //DisplayConversions.InputCentimeters();
        //DisplayConversions.InputKilos();
        DisplayConversions.InputLbs();   
        //TestInput();
    }
    
    public static void TestInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input to test: ");        
        String strToTest = input.nextLine();
        DisplayConversions.TestInput(strToTest);
    }
    
}
