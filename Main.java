public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 20, "Computer Science", 3.8);
        Student s2 = new Student(2, "Bob", 22, "Mathematics", 3.5);

        System.out.println(s1);
        System.out.println(s2);

        s1.setGpa(3.9);
        System.out.println("Updated: " + s1);
    }
}
