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
        studentMyList.add(0, giang);
        studentMyList.add(luat);

        System.out.println("Name of Student in student list");
        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.get(i).getName());
        }
        Student studentRemove = studentMyList.remove(1);
        System.out.println("Remove and return student at index 1: " + studentRemove);
        System.out.println("Student list after remove");
        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.get(i).getName());
        }

        System.out.println("index of Trung in list " + studentMyList.indexOf(trung));

        System.out.println("Is student list contain Khoa: " + studentMyList.contains(khoa));

        System.out.println("Clear all student in list:");
        studentMyList.clear();
        System.out.println("Size of student list after clear " + studentMyList.size());
    }
}
