public class Employee {
    private int emp_id;
    private String emp_name;
    private int emp_age;

    public int getEmp_id(){
        return emp_id;
    }
    public void setEmpId(int emp_id){
        this.emp_id = emp_id;
    }
    public String getEmpName(){
        return emp_name;
    }
    public void setEmpname(String emp_name){
        this.emp_name = emp_name;
    }
    public int getEmp_age(){
        return emp_age;
    }
    public void setEmpage(int emp_age){
        this.emp_age = emp_age;
    }
}
class Runemployee{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(56246);
        e.setEmpname("sewmini");
        e.setEmpage(22);
        System.out.println("Id="+e.getEmp_id()+"\n"+"Name=" + e.getEmpName()+"\n"+"Age="+e.getEmp_age() );

    }
}
