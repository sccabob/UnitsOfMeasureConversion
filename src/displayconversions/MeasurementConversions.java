package displayconversions;

import java.text.DecimalFormat;

/**
 * @author Robert Holahan
 */
public class MeasurementConversions {

    public void MeasurementConversions() {
    }

    public static double inchesToCentimeters(double Inches) {

        double centimeters = Inches * 2.54;
        return formatNumber(centimeters);
    }

    public static double centimetersToInches(double Centimeters) {

        double inches = Centimeters * 0.39370078740158;
        return formatNumber(inches);
    }
    
    public static double kilosToLbs(double Kilos) {

        double lbs = Kilos * 2.20462262;
        return formatNumber(lbs);
    }

    public static double lbsToKilos(double Lbs) {

        double kg = Lbs / 2.20462262;
        return formatNumber(kg);
    }
    
    public static double cubicInchesToCc(double CubicInches){
        
        double cc = CubicInches * 16.387064;
        return formatNumber(cc);
    }
    
    public static double cubicInchesToLiters(double CubicInches){
        
        double liters = (CubicInches * 16.387064) / 1000;
        return formatNumber(liters);
    }
    
    public static double ccToCubicInches(double CubicCentimeters){
        
        double ci = CubicCentimeters * .061;
        return formatNumber(ci);
    }

    private static double formatNumber(double Number) {

        DecimalFormat formatDecimal = new DecimalFormat("#0.000");
        String formatNumber = formatDecimal.format(Number);
        return Double.parseDouble(formatNumber);
    }
}
