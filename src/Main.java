
import Util.MathUtil;
import Util.MathUtillmpl;


public class Main {
    public static void main(String[] args) {
        MathUtil mu=new MathUtil();

        int res= mu.getRectangleArea();
        System.out.println("Area of rectangle:"+res);

        double resTemp1=mu.calculateFromCelciusToFarenheit();
        System.out.println("From celcius to faranheit:"+resTemp1);

        double averageGrade=mu.getAverageGradeScore();
        System.out.println("Average grade score is:"+averageGrade);

        double moneyConvert=mu.convertMoney();
        System.out.println("From manat to dollar:"+moneyConvert);

        int resultOfSwap= mu.swapValues();

        double bodyMassIndex=mu.calculateBodyMassIndex();
        System.out.println("Body mass index:"+bodyMassIndex);

        double fromKmToMiles=mu.calculateKilometersToMiles();
        System.out.println("Distance from km to miles:"+fromKmToMiles);

        double fromMilesToKilometers=mu.fromMilesToKilometers();
        System.out.println("Distance from miles to kilometers:"+fromMilesToKilometers);

        double totalAmount=mu.calculateTotalAmount();
        System.out.println("Total amount:"+totalAmount);

        double timeConverter=mu.calculateTime();
        System.out.println("From seconds to minutes:"+timeConverter);
    }
}