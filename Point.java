/*
The class Point should of course be able to handle other points with different (x,y) values.
• The coordinates (x,y) are always integers.
• The method toString returns a string with coordinates suitable for print-outs.
• Distance between two points (x,y) and (p,q) is computed as Sqrt( (x-p)^2 + (y-q)^2 ).
• Two points are equal if they have the same coordinates.
• Method move moves the point certain steps in x- and y-direction.
• Method moveToXY provide a new set of coordinates.
*/


public class Point {
    int x = 0;
    int y = 0;

    public Point(int i, int j) {
        this.x = i;
        this.y = j;
    }

    void move(int a, int b) {
        this.x += a;
        this.y += b;
    }

    void moveToXY(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public static void main(String[] args) {
        //Point p1 = new Point();
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        System.out.println(p1.toString()); // ==> (0,0)
        System.out.println(p2.toString()); // ==> (3,4)
        
        if (p1.isEqualTo(p2)) // False!
            System.out.println("The two points are equal");
        
        double dist = p1.distanceTo(p2);
        System.out.println("Point Distance: "+dist);
        p2.move(5,-2); // ==> (8,2)
        p1.moveToXY(8,2); // ==> (8,2)

        if (p1.isEqualTo(p2)) // True!
            System.out.println("The two points are equal");
        /*
        results in the following console print-out:
        (0,0)
        (3,4)
        Point Distance: 5.0
        The two points are equal
        */
    }

    public boolean isEqualTo(Point a) {
        if (a.x == this.x && a.y == this.y) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String a = Integer.toString(this.x);
        String b = Integer.toString(this.y);

        return "(" + a + "," + b + ")";
    }

    public double distanceTo(Point a) {
        return Math.sqrt( (this.x-a.x)^2 + (this.y-a.y)^2 );
    }

    //  Sqrt(  ).
}