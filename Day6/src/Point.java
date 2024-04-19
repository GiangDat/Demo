public class Point {
    private float x;
    private float y;


    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x= 2;
        y=3;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxy(float x, float y) {
        this.setxy(3, 5);
    }

    public float[] getxy() {
        float[] arr={x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "Diem nay co toa do la x =" + getX() + "va y la" + getY();
    }
}
