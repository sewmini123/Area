public class Software {
    private String name;
    private String contact_no;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getContactno() {
        return contact_no;
    }
    public void setcontactNo(String contact_No){
        this.contact_no = contact_no;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
class Runsoftware{
    public static void main(String[] args) {
        Software s = new Software();
        s.setName("sahasra");
        s.setcontactNo("+94779141394");
        s.setAge(22);
        System.out.println("Name =" + "\t" + s.getName() + "\n" + "contact_no" + "\t" + s.getContactno() + "\n" + "Age" + "\t" + s.getAge());
    }
}