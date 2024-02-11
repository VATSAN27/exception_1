public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "omar", 35, "Computer Science");
            System.out.println("Student 1:");
            System.out.println("Roll No: " + student1.getRollNo());
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Course: " + student1.getCourse());
            System.out.println("-------------------------");

            Student student2 = new Student(2, "salim", 21, "viscom");
            System.out.println("Student 2:");
            System.out.println("Roll No: " + student2.getRollNo());
            System.out.println("Name: " + student2.getName());
            System.out.println("Age: " + student2.getAge());
            System.out.println("Course: " + student2.getCourse());
            System.out.println("-------------------------");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
