package displayconversions;

import java.text.DecimalFormat;

/**
 *@author Robert Holahan
 * 
 */
public class MeasurementConversions {
    
    public void MeasurementConversions(){       
    }
       
    public static double InchesToCentimeters(double Inches){
        
        double  centimeters = Inches * 2.54;
        return formatNumber(centimeters);
    }
       
    public static double CentimetersToInches(double Centimeters){
                    
        double inches = Centimeters * 0.39370078740158;
        return formatNumber(inches);    
    }
    
    public static double KilosToLbs(double Kilos){
        
        double lbs = Kilos * 2.20462262;
        return formatNumber(lbs);
    }
    
    public static double LbsToKilos (double Lbs){
        
        double kg = Lbs/2.20462262;
        return formatNumber(kg);    
    }
  
    private static double formatNumber(double Number){
        
        DecimalFormat formatDecimal = new DecimalFormat("#0.000");        
        String formatNumber = formatDecimal.format(Number);
        return Double.parseDouble(formatNumber);      
    }         
}
