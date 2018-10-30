package src.main;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        
        /*Testing Rectangle*/
        int length = 3, width = 4;
        Rectangle r = new Rectangle(width,length); //constructor
        System.out.println("After creating Rectangle object");
        System.out.println("Rectangle length = " + r.getLength());
        System.out.println("Rectangle width = " + r.getWidth());
        
        //Set length and width 
        r.setLength(5);
        r.setWidth(6);
        System.out.println("\nAfter setting length and width to 5 and 6");
        System.out.println("Rectangle length = " + r.getLength());
        System.out.println("Rectangle width = " + r.getWidth());
        
        //testing area and perimeter
        System.out.println("\nArea = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
        
        //Testing compareTo
        Rectangle r1 = new Rectangle(2,2);
        Rectangle r2 = new Rectangle(4,6);
        System.out.println("\nTesting rectangle CompareTo");
        System.out.println("Rectangle1 Area = " + r1.area());
        System.out.println("Rectangle2 Area = " + r2.area());
        if(r1.compareTo(r2) < 0)
            System.out.println("Rectangle1 < Rectangle2");
        else
             System.out.println("Rectangle1 > Rectangle2");
        
        /*Testing Cuboid*/
        int w = 2, l = 3, d = 4;
        Cuboid c = new Cuboid(w, l, d);
        System.out.println("\nAfter creating Cuboid object");
        System.out.println("Cuboid width = " + c.getWidth());
        System.out.println("Cuboid length = " + c.getLength());
        System.out.println("Cuboid depth = " + c.getDepth());
        
        w = 5; l = 2; d = 3;
        System.out.println("\nSetting length, width, depth to 5,2,3");
        c.setDepth(d);
        c.setLength(l);
        c.setWidth(w);
        System.out.println("Cuboid length = " + c.getLength());
        System.out.println("Cuboid width = " + c.getWidth());
        System.out.println("Cuboid depth = " + c.getDepth());
        
        System.out.println("\nArea = " + c.area());
        
        
        try
        {
            System.out.println("Perimeter = " + c.perimeter());
        } catch (UnsupportedOperationException uoe)
        {
            System.err.println("UnsupportedOperationException");
        }
        System.out.println("Volume = " + c.volume());
        
        ArrayList<Cuboid> list = new ArrayList<>();
        Cuboid c1 = new Cuboid(1,2,3);
        Cuboid c2 = new Cuboid(3,4,5);
        System.out.println("\nCuboid1 Area = " + c1.area() + " Volume = " + c1.volume());
        System.out.println("Cuboid2 Area = " + c1.area() + " Volume = " + c1.volume());
        list.add(new Cuboid(1,2,3));
        list.add(new Cuboid(3,4,5));
        
        //Sort by area
        System.out.println("\nSorted By Area");
        list.sort(new SortByArea());
        for (int i = 0; i < list.size(); i++) 
            System.out.println(list.get(i).area());
        
        //Sort by volume
        System.out.println("Sorted By Volume");
        list.sort(new SortByVolume());
        for (int i = 0; i < list.size(); i++) 
            System.out.println(list.get(i).volume());
            
        
        
        
        
        
        
    }
    
}
