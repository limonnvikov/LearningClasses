public class TestExtends {
    public static void main(String[] args) {

        Person person = new Person("Ilya", 24, "123");
        System.out.println("Person name: " + person.getName() + ", " + person.getAge());
        boolean isPasswordCorrect = person.chekPassword("123");
        if (isPasswordCorrect) {
            System.out.println("Password correct");
        }
        else {
            System.out.println("Password incorrect");
        }
BankAccount user = new BankAccount(12.12);
        System.out.println(" " + user.getBalance());
    }
}

class Person{
 public String name;
 public int age;
 private String password;

 public Person(String name, int age, String password) {
     this.name = name;
     this.age = age;
     this.password = password;
 }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public boolean chekPassword(String inputPassword) {
     return this.password.equals(inputPassword);
    }
    public void setPassword(String newPassword) {
     this.password = newPassword;
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newbalance) {
        this.balance = newbalance;
    }
}

