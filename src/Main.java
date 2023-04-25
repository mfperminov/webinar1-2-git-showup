public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        while (true) {
            String name = input.getStringInput("Enter name of a student ");
            int id = input.getIntInput("Enter id of a student ");
            double grade1 = input.getDoubleInput("Enter first grade ");
            double grade2 = input.getDoubleInput("Enter second grade ");

            Student student = new Student(name, id, grade1, grade2);

            System.out.println("Student record:");
            System.out.println("Student name: " + student.getName());
            System.out.println("Student id: " + student.getId());
            System.out.println("Student average grade: " + student.getAverageGrade());

            String endQuestion = input.getStringInput("Finish? ");
            if (endQuestion.equalsIgnoreCase("yes")) {
                System.out.println("Exit");
                break;
            }
        }
    }
}