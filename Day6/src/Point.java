public class Point {
    private float x;
    private float y;
    //private float xy;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        return;
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

    public void getxy() {
        return;
    }

    @Override
    public String toString() {
        return "Diem nay co toa do la x =" + getX() + "va y la" + getY();
    }
}
