public class Account {
    private int acc_no;
    private String name ,email;
    private double balance;

    public int getAcc_no(){
        return acc_no;
    }
    public void setAcc_no(int acc_no){
        this.acc_no = acc_no;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
class TestAccount {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAcc_no(12345678);
        a.setName("sewmini");
        a.setEmail("sahasradinith@gmail.com");
        a.setBalance(56789776.87);
        System.out.println("No=" + a.getAcc_no() + "\n" + "Name=" + a.getName() + "\n" + "Email=" + a.getEmail() +"\n"  + "Balanc =" +  a.getBalance());

    }
}

