public class Main {

    public static void main(String args[]) {

        System.out.println("Hello From Lappy");
        System.out.println("Changed From Local Repo.");
        System.out.println("Aka Jenkins Worked");

        Student s = new Student("Pradyumna", "101JenkinsTrainee");
        s.printDetails();

        Courses c = new Courses("CSIT");
        c.printCourseName();
        System.out.println("Hello Next Day Code Push");

    }
}