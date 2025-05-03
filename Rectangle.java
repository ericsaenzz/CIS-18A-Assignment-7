public class Rectangle{

    private double length = 1.0;
    private double width = 1.0;

    public Rectangle(){ //constructor
    }
    public Rectangle(double length, double width){//constructor w/ param 1
        setLength(length);
        setWidth(width);
    }

    public double getwidth(){
        return width;
    }
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException(">> ERROR. LENGTH must fall between 0 and 20");
        }
    }

    public double getlength(){
        return length;
    }
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException(">> ERROR. LENGTH must fall between 0 and 20");
        }
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
}