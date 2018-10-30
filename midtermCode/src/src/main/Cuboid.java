package src.main;


public class Cuboid extends Rectangle
{
    private int depth;

    public Cuboid(int width, int length,int d) {
        super(width, length);
        depth = d;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double area() {
        return 2*(getLength()*getWidth() + getWidth()*depth + depth*getWidth());
    }
    
    public double volume()
    {
        return getLength()*getWidth()*depth;
    }
    
}
