/**
 * Created by vakula on 14.7.2016.
 */
public class CollegeStudent extends Student {
    private int year;
    private Major major;

    public CollegeStudent(String name, int age, String gender, String id, double gpa, int year, Major major) {
        super(name, age, gender, id, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Major getMajor() {
        return major;
    }
    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
