package A3;

import java.util.Scanner;

// Q. WAP to print the circumference and the area of the circle of radius entered by user by defining your own method.
public class Circumference_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();
        Circumference(radius);
        Area(radius);
    }

    static void Circumference (float radius){
        float circum = (2* ((float)22/7) * radius);
        System.out.println(circum);
    }
/// float by integer gives you a float value(more precise value).
    //  if you do just 22/7 it gives a lot more difference (because it is taking it as a integer.)
    static void Area (float radius) {
        float area = ((float)22/7) * (radius * radius);
        System.out.println(area);
    }
}
