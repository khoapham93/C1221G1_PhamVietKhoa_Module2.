package oop_review.bai_3_manager_employee;

public class NhanVien extends CanBo {
    private String task;

    public NhanVien(String name, int birthday, String gender, String address, String task) {
        super(name, birthday, gender, address);
        this.task = task;
    }

    public NhanVien() {

    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                super.toString() +
                "task='" + task + '\'' +
                '}';
    }
}
