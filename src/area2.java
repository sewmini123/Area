import java.util.Scanner;
public class area2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length:" );
        double L = sc.nextDouble();

        System.out.println("width:" );
        double W = sc.nextDouble();
        double area = L * W ;

        System.out.println("Area =" + "\t" + area);
    }

}
