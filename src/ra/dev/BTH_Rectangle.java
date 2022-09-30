package ra.dev;

import java.awt.*;

public class BTH_Rectangle {
    double width, height;

    public BTH_Rectangle() {
    }

    public BTH_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
   public String display(){
        return "Rectangle{"+"width="+width+", height="+height+"}";
   }
}
