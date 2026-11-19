/*
Create a method to calculate the area of a rectangle. The method should accept
 two side lengths as input and return the area.

The method must support both int and double values:

If the input values are integers (int), the result must be an integer (int).

If the input values are doubles (double), the result must be a double (double).
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String [] args){

        System.out.println(area(3, 4));

        System.out.print (area( 4.5, 3 ));


        }
        static int area( int ilgis, int plotis){
            return ilgis * plotis;
    }
        static double area(double ilgis, double plotis){
        return ilgis* plotis;
        }
}
