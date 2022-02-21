package ss5_accessmodifier_static.bai_tap.writting_only_class;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {

    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
