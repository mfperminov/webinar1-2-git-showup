public class Student {
    private String name;
    private int id;
    private double grade1;
    private double grade2;

    public Student(String name, int id, double grade1, double grade2) {
        this.name = name;
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getAverageGrade() {
        return (grade1 + grade2) / 2;
    }
}
