package oop_review.bai_1_quan_ly_nhan_vien;

public class CongNhan extends CanBo {
    private String skillLevel;

    public CongNhan(String name, int birthday, String gender, String address, String bacTho) {
        super(name, birthday, gender, address);
        this.skillLevel = bacTho;
    }

    public CongNhan() {
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                super.toString() +
                ", skill level='" + skillLevel + '\'' +
                '}';
    }
}
