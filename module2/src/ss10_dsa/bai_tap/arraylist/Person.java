package ss10_dsa.bai_tap.arraylist;

public class Person {
    protected int id;
    protected String name;
    protected String birthday;

    public Person() {

    }

    public Person(int id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
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

    public void goToBy() {
        System.out.println("đi bộ");
    }

    //điểm danh - chấm công
    public void attendance() {
        System.out.println("Phương thức chấm công");
    }
}
