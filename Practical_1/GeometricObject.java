import java.util.*;

public abstract class GeometricObject{
    private String color;
    private boolean filled;
    private Date datecreated;

    protected GeometricObject() {}
    
    protected GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String s = "";
        if(filled)
            s = "\nThe object is filled";
        else
            s = "\nThe object is not filled";
        return "The color of the Geometric object is " + color + "\nThe date of object creation " + datecreated + s;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}