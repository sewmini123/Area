import java.util.Scanner;
public class Employe {
    double basic_salary;
    double allowance;
    double deduction;

    public Employe() {
    }

    public void salary(double basic_salary, double allowance, double deduction) {
        this.basic_salary = basic_salary;
        this.allowance = allowance;
        this.deduction = deduction;
    }

    public double Netsalary() {
        return basic_salary + allowance - deduction;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Salary of Employee: ");
        double basic_salary = sc.nextDouble();

        System.out.println("Allowance of Employee: ");
        double allowance = sc.nextDouble();

        System.out.println("Deducation of Employee: ");
        double deducation = sc.nextDouble();

        Employe emp = new Employe();
        emp.salary(basic_salary , allowance ,deducation);

        double Net_salary = emp.Netsalary();
        System.out.println("The Net salary of Employee " +Net_salary);

    }
}
