package ss0_demo.manager_student;

public class ManagerStudent {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Khoa", "27-01", "C2121G1");
        students[1] = new Student(2, "Trung", "27-03", "C2121G1");
        students[2] = new Student(3, "Luat", "21-04", "C2121G1");
        students[3] = new Student(4, "Nghia", "07-01", "C2121G1");
        students[4] = new Student(5, "Trinh", "29-01", "C2121G1");
    }

    public void displayStudentList() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }
        }
    }

    public void add() {

    }

    public void edit() {
        
    }
}
