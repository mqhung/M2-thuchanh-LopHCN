public class Rectangular {
    double width;
    double height;

    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return  2*(this.height+this.width);
    }
    public String display(){
        return "width = " + width + "\t" + "height = " + height;
    }
}

