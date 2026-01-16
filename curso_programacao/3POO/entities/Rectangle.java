package entities;

public class Rectangle {

    public double width;
    public double height;

    public double Area(){
        double area = width * height;
        return area;
    }

    public double Perimeter(){
        double perimeter = (width * 2) + ( height * 2);
        return perimeter;
    }

    public double Diagonal(){
        double diagonal = Math.sqrt(( height * height) + (width * width));
        return diagonal;
    }
}
