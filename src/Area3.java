import java.util.Scanner;
public class Area3 {
    int length;
    int width;

    public Area3() {
    }


    public void length(int length , int width) {
        this.length = length;
        this.width=width;
    }


    public int calculate() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        int width = sc.nextInt();

        Area3 area = new Area3();
        area.length(length,width);

        int Rectangle =area.calculate();
        System.out.println("The area of the rectangle is " +Rectangle);

    }
}
