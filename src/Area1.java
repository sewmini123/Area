public class Area1 {
        int length=5;
        int breadth=10;

        public void setDim(int lenght,int breadth) {

        }

        public void getArea() {
            System.out.println(" Area is: " + length * breadth);
        }

        public static void main(String[] args) {
            Area1 Rarea = new Area1();
            Rarea.setDim(5,10);
            Rarea.getArea(); //
        }
    }



