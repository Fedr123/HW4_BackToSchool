import javax.swing.text.html.parser.Entity;

/**
 * Created by vakula on 21.7.2016.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Person [] personsArr  = new Person [4];

        personsArr[0] = new Person ("Coach Bob", 27, "M");
        personsArr[1] = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        personsArr[2] = new Teacher("Duke Java", 34, "M",  50000.0, Subject.COMPUTER_SCIENCE);
        personsArr[3] = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, Major.ENGLISH);


        for (Object o : personsArr){
            System.out.println(o.toString());
        }

    }
}
