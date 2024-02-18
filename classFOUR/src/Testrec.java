public class Testrec {
    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(3,0);
        Point c = new Point(3,4);
        Point d = new Point(0,4);
        Rectangle rr = new Rectangle(a,b,c,d);
        System.out.println(rr.perimeter());
        System.out.println(rr.lengthOfDiagonal());
        Point x1 = new Point(1,3);
        Point x2 = new Point(2,3);
        Point x3 = new Point(2,4);
        Point x4 = new Point(1,4);
        if (rr.PointInsideRectangle(x1)==0){
            System.out.println("YES Inside");
        }
        else {
            System.out.println("NO not Inside");
        }

        Rectangle  newRec= new Rectangle(x1,x2,x3,x4);
        rr.RectangleInsideRectangle(newRec);
    }

}
