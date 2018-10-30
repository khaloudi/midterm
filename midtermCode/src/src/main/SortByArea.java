package src.main;

import java.util.Comparator;


public class SortByArea implements Comparator<Cuboid>{

    @Override
    public int compare(Cuboid o1, Cuboid o2) {
       return (int) (o1.area() - o2.area());
    }

    
}
