public class Student {
    private int id;
    private String name;
    private int age;
    private String department;
    private double gpa;

    public Student(int id, String name, int age, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "|" + id + " |" + name + "\t\t|" + age + " |" + department + "\t|" + gpa + "|";
    }
}
