package ss10_dsa.bai_tap.arraylist;

public class Student extends Person {
    private String className;
    static String school = "CodeGym";

    public Student() {
    }

    public Student(int id, String name, String birthday, String className) {
        super(id, name, birthday);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    //Phương thức riêng của student
    public void study(String subject) {
        System.out.println(this.name + " đang học môn " + subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
