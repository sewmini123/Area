import java.util.Scanner; // import krnw
public class ar {

    int length;
    int breadth;     // variable declaire

    public ar() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }  // set lenghth

    public int getBreadth() {
        return breadth;
    }   // returning the length

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }   // set the breath

    public int getArea() {
        return length * breadth;
    }   // method eka get krnw

    public static void main(String[] args) {   // main method
        Scanner sc = new Scanner(System.in);   // object calling

        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        ar area = new ar(); // object creation
        area.setLength(length);
        area.setBreadth(breadth);

        int areaOfRectangle = area.getArea();

        System.out.println("The area of the rectangle is " + areaOfRectangle); // final output
    }
}



