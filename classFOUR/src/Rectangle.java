public class Rectangle {
    Point p1,p2,p3,p4;
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    double lengthOfDiagonal(){
        double y = (this.p1.x-this.p2.x)*(this.p1.x-this.p2.x);
        double z = (this.p1.y-this.p2.y)*(this.p1.y-this.p2.y);
        double lineOne = Math.sqrt(y+z);
        double a = (this.p2.x-this.p3.x)*(this.p2.x-this.p3.x);
        double b = (this.p2.y-this.p3.y)*(this.p2.y-this.p3.y);
        double lineTwo = Math.sqrt(a+b);
        return Math.sqrt((lineOne*lineOne)+(lineTwo)*(lineTwo));
    }
    double perimeter(){
        double y = (this.p1.x-this.p2.x)*(this.p1.x-this.p2.x);
        double z = (this.p1.y-this.p2.y)*(this.p1.y-this.p2.y);
        double lineOne = Math.sqrt(y+z);
        double a = (this.p2.x-this.p3.x)*(this.p2.x-this.p3.x);
        double b = (this.p2.y-this.p3.y)*(this.p2.y-this.p3.y);
        double lineTwo = Math.sqrt(a+b);
        return 2*(lineOne+lineTwo);
    }
    public int PointInsideRectangle(Point p){
        if(p.x <= this.p3.x && p.x>=this.p1.x && p.y <= this.p3.y && p.y >= this.p1.y ){
            return 0;
        }
        else{
            return 1;
        }
    }

    public void RectangleInsideRectangle(Rectangle r){
        if (r.p1.x <= this.p3.x && r.p1.x >= this.p1.x && r.p1.y<= this.p3.y && r.p1.y >= this.p1.y && r.p3.x <= this.p3.x && r.p3.x >= this.p1.x && r.p3.y<= this.p3.y && r.p3.y >= this.p1.y){
            System.out.println("Inside Rectangle");
        }
        else {
            System.out.println("Not Inside Rectangle");
        }
    }



}
