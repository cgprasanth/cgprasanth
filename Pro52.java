package pro;
import java.awt.Point;
import java.util.*;
public class Pro52 {
	static ArrayList<Point> al=new ArrayList<Point>();
	Scanner ss=new Scanner(System.in);
    public static void userMethod(){
       int d1=distance(al.get(0),al.get(1));
       int d2=distance(al.get(0),al.get(2));
       int d3=distance(al.get(0),al.get(3));
       if(d1==d2&&(d1+d2==d3)){
            System.out.println("output : Square");
       }
       else if(d1==d3&&(d1+d3==d2)){
    	   System.out.println("output : Square");
       }
       else{
    	   System.out.println("output : Not a Square");
       }
	}
    private static int distance(Point point1,Point point2){
    	return (int) (Math.pow(point2.x-point1.x,2)+Math.pow(point2.y-point1.y, 2));
    }
	public static void main(String[] args){
		
		al.add(new Point(10,10));
		al.add(new Point(10,20));
		al.add(new Point(20,20));
		al.add(new Point(20,10));
		userMethod();
	}

}
