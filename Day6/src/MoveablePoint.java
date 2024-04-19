public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){
        super();
        xSpeed=5;
        ySpeed=8;
    }


    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    public String toString(){
        return "("+this.getX()+","+this.getY()+") xSpeed="+xSpeed+", ySpeed="+ySpeed;
    }

    public MoveablePoint move(){
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        setX(newX);
        setY(newY);
        return this;
    }
}
