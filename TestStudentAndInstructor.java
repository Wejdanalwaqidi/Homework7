public class TestStudentAndInstructor {
    public static void main(String[] args) {


        Student s = new Student("Asmaa", "2004", "IT");
        System.out.println(s.toString());
        Instructor i = new Instructor("Fatima", "1994", 100000);
        System.out.println(i.toString());

    }
}