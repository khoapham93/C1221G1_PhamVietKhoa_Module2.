package ss0_demo.manager_student;

public class Student {
    private int id;
    private String name;
    private String birthday;
    private String className;
    static String school = "CodeGym";

    public Student() {
    }

    public Student(int id, String name, String birthday, String className) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
