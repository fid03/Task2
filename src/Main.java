
import Util.MathUtil;
import Util.Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathUtil mu=new MathUtil();

        int res= mu.areaOfRectangle();
        System.out.println("Area of rectangle:"+res);

        double resTemp1=mu.fromCelciusToFarenheit();
        System.out.println("From celcius to faranheit:"+resTemp1);

        double averageGrade=mu.averageGradeScore();
        System.out.println("Average grade score is:"+averageGrade);

        double moneyConvert=mu.moneyConverter();
        System.out.println("From manat to dollar:"+moneyConvert);

        int resultOfSwap= mu.swapValues();

        double bodyMassIndex=mu.calculateBodyMassIndex();
        System.out.println("Body mass index:"+bodyMassIndex);

        double fromKmToMiles=mu.kilometersToMiles();
        System.out.println("Distance from km to miles:"+fromKmToMiles);

        double fromMilesToKilometers=mu.fromMilesToKilometers();
        System.out.println("Distance from miles to kilometers:"+fromMilesToKilometers);

        double totalAmount=mu.calculateTotalAmount();
        System.out.println("Total amount:"+totalAmount);

        double timeConverter=mu.calculateTime();
        System.out.println("From seconds to minutes:"+timeConverter);
    }
}