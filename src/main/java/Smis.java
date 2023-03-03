import lib.Student;

public class Smis {
    public static void main(String[] args) {
        System.out.println("hello");

        Student fahim, iqbal, amit;

        fahim = new Student(1, "fahimul hoque");
        iqbal = new Student("shahrair iqbal", 2);
        amit = new Student(3,"amit", "CSE");

        fahim.read();
        iqbal.write();
        amit.read();

    }
}
