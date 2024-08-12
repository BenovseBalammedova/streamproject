package entity;

public class User extends Person{
   private int age;
   private int salary;
   private String surname;

    public User() {
    }

    public User(String name, int id, int age, int salary, String surname) {
        super(name, id);
        this.age = age;
        this.salary = salary;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", salary=" + salary +
                ", surname='" + surname + '\'' +
                "} " + super.toString();
    }
}
