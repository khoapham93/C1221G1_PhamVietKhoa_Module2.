package ss10_dsa.bai_tap.arraylist;

public class TestMyList {
    public static void main(String[] args) {
        Student khoa = new Student(1, "Khoa", "22/12", "C12");
        Student trung = new Student(2, "Trung", "22/12", "C12");
        Student giang = new Student(3, "Giang", "22/12", "C12");
        Student luat = new Student(4, "Luat", "22/12", "C12");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(khoa);
        studentMyList.add(trung);
        studentMyList.add(giang);
        studentMyList.add(luat);

        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.get(5).getName());
        }

    }
}
