import java.util.Scanner;
class Rectangle 
{
    float length;
    float width;

    public Rectangle(float len, float wid)
    {
        length = len;
        width = wid;
    }

    public float calcArea() 
    {
        return length * width;
    }

    public float calcPeri() 
    {
        return 2 * (length + width);
    }

    public void displayDetails() 
    {
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Area: "+String.format("%.2f", calcArea()));
        System.out.println("Perimeter: "+String.format("%.2f", calcPeri()));
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        float length = in.nextFloat();

        System.out.print("Enter the width of the rectangle: ");
        float width =in.nextFloat();

        Rectangle us= new Rectangle(length, width);
        us.displayDetails();

    }
}