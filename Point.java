public class Point {
    int x;
    int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int i, int j) {
        this.x = i;
        this.y = j;
    }

    void move(int c, int d) {
        this.x += c;
        this.y += d;
    }

    void moveToXY(int a, int b) {
        this.x = a;
        this.y = b;
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
        var input1 = Math.pow((this.x - a.x), 2);
        var input2 = Math.pow((this.y - a.y), 2);
        return Math.sqrt(input1 + input2);
    }
}

class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
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
}