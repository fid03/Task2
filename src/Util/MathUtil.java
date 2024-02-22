package Util;

public class MathUtil implements MathUtillmpl {
    public int getRectangleArea() {

        int length = (int)InputUtil.requireNumber("Enter length of rectangle");
        int width =(int)InputUtil.requireNumber("Enter width of rectangle");
        int area = length * width;
        return area;
    }

    public  double calculateFromCelciusToFarenheit() {

        double celcius =InputUtil.requireNumber("Enter temperature in celcius");
        double fromCelciustoFarenheit = (celcius * (9 / 5) + 32);
        return fromCelciustoFarenheit;
    }

    public  double getAverageGradeScore() {
        int sc1 = (int) InputUtil.requireNumber("Enter 1st grade score");
        int sc2=(int)InputUtil.requireNumber("Enter 2nd grade score");
        int sc3=(int)InputUtil.requireNumber("Enter 3rd grade score");
        double average=(sc1+sc2+sc3)/3;
        return average;
    }

    public double convertMoney(){
        double amount=InputUtil.requireNumber("Enter amount");
        double convertedAmount=amount*1.7;
        return convertedAmount;
    }
    public int swapValues(){
        int a=(int)InputUtil.requireNumber("Enter value of -a");
        int b=(int)InputUtil.requireNumber("Enter value of -b");
        a=a+b;
        System.out.println("Value of=>a:"+a);
        b=a-b;
        System.out.println("Value of=>b:"+b);
        a=a-b;
        System.out.println("Value of=>a:"+a);
        return a;
    }

    public double calculateBodyMassIndex(){
       double weight=InputUtil.requireNumber("Enter your weight (in kilograms)");
       double height=InputUtil.requireNumber("Enter your height (in meters)");
       double bmi=(weight/Math.pow(height,2));
       return bmi;
    }
    public double calculateKilometersToMiles(){
        double km=InputUtil.requireNumber("Enter distance in km");
        double fromKmToMiles=km/1.6;
        return fromKmToMiles;
    }
    public double fromMilesToKilometers(){
        double miles=InputUtil.requireNumber("Enter distance in miles");
        double fromMilesToKilometers=miles*1.6;
        return fromMilesToKilometers;
    }

    public double calculateTotalAmount(){
        double givenAmount=InputUtil.requireNumber("Enter current amount");
        double interestRate=InputUtil.requireNumber("Enter rate of interest");
        interestRate=interestRate/100;
        double term=InputUtil.requireNumber("Enter term of loan");
        double totalAmount=givenAmount*interestRate*term;
        return totalAmount;
    }

    public double calculateTime(){
        int seconds=(int)InputUtil.requireNumber("Enter seconds");
        double minutes=seconds/60;
        return minutes;
    }
}
