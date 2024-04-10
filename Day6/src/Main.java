public class Main {
    public static void main(String[] args) {

//        //Lớp Stopwatch
//        StopWatch stopwatch = new StopWatch();
//        // Do some operation
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        stopwatch.stop();
//        long elapsedTime = stopwatch.getElapsedTime();
//        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
//
//
//        System.out.println("---------------------------------------------------");
      // Lớp hình tròn
        Circle circle = new Circle(5, "xanh");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(10, "Đỏ", 30);
        System.out.println(cylinder.toString());

//
//        System.out.println("---------------------------------------------------");
//        // Lớp 2D-3D
//        Point2D point2D=new Point2D(2,5);
//        System.out.println(point2D.toString());
//        Point3D point3D=new Point3D(3,8,9);
//        System.out.println(point3D.toString());



    }
}