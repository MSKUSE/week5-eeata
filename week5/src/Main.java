public class Main {
    public static void main(String[] args) {

        point p1 = new point();
        String s1 = new String("eylul");
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);
        point p2 = new point(3,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);
        point p3 = new point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);


        point tLeft =new point(3,4);
        Rectangle r1= new Rectangle (new point (3,4), 3, 4);
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopleft().xCoord);
        System.out.println(r1.getTopleft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());


Circle c1 =new Circle (new point (3,4),
        5);
        System.out.println(c1.getRadius());
        c1.setRadius(-21);
        System.out.println(c1.getRadius());



    }
}