package src.main;


public class Rectangle extends Shape{

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
       return length*width;
    }

    @Override
    public double perimeter() {
       return 2*(length + width);
    }
    
    public int compareTo(Object o)
    {
        Rectangle r = (Rectangle) o;
        int compare = (int) (this.area() - r.area());
        
        return compare;
        
    }
}
