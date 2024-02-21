package Util;

import java.util.Scanner;

public class InputUtil {

    public static double requireNumber(String title){
        Scanner sc=new Scanner(System.in);
        System.out.println(title+":");
        double answer=sc.nextDouble();
        return answer;

    }
}
