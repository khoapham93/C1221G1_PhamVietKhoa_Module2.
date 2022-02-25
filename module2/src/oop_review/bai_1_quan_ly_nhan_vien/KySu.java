package oop_review.bai_1_quan_ly_nhan_vien;

public class KySu extends CanBo {
    private String major;

    public KySu(String name, int birthday, String gender, String address, String major) {
        super(name, birthday, gender, address);
        this.major = major;
    }

    public KySu() {

    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "KySu{" +
                super.toString() +
                ", major='" + major + '\'' +
                '}';
    }
}
