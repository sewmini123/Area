public class Area {
    private double length;
    private double width;
    Area(double length , double width){
        this.length = length;
        this.width = width;
    }
    public void getArea(){
        double area =length * width;
        System.out.println("Area =" + "\t" + area);
    }
}
class Runarea{
    public static void main(String[] args) {
        Area a = new Area(5 ,10);
        a.getArea();
    }
}
