public class Salary1 {
     int basic_salary=15500;
     int allowance=5000 ;

     public Salary1(){

     }
     public void salary(int basic_salary , int allowance){
          this.basic_salary = basic_salary;
          this.allowance = allowance;
     }
     public int Gros_salary() {
          return basic_salary + allowance;
     }
     public static void main(String[] args) {
          Salary1 sl = new Salary1();
          sl.salary(15500,500);

          int G_salary = sl.Gros_salary();
          System.out.println("Gros salay:" + G_salary);
     }
}
