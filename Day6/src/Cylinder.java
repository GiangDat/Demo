public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHigh(double height) {
        this.height = height;
    }
    public  double getVolume(){
        return getArea() * height;

    }
    @Override
    public  String toString(){
        return "hinh tru co chu vi la: "+getRadius()+" va mau sac la mau:"+getColor()+ ", No co dien tich bang : "+getArea()
                + " Có chiều cao bằng : " +getHeight()+ "Và thể tích là : "+ getVolume();

    }
}
