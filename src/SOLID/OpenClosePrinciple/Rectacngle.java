package SOLID.OpenClosePrinciple;

public class Rectacngle implements OpenClosePrincilple{
    int height = 10;
    int width = 20;
    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle is "+height*width);
    }
}
