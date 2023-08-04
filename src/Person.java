public class Person {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class Run{
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(24);
        System.out.println("Age of this person =" + p.getAge() + "years");
    }
}
