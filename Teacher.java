/**
 * Created by vakula on 14.7.2016.
 */
public class Teacher extends Person{

    private double salary;
    private Subject subject;

    public Teacher(String name, int age, String gender, double salary, Subject subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }



    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Subject getSubject() {
        return subject;
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }



    @Override
    public String toString() {
        return super.toString() + ", salary: " + salary + ", subject: " + subject.name();
    }
}
