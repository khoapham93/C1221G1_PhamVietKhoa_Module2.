package test_case_module_2.model;

public class ClassRoom {
    private int id;
    private String nameClassRoom;
    private int teacherId;

    public ClassRoom(int id, String nameClassRoom, int teacherId) {
        this.id = id;
        this.nameClassRoom = nameClassRoom;
        this.teacherId = teacherId;
    }

    public ClassRoom() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClassRoom() {
        return nameClassRoom;
    }

    public void setNameClassRoom(String nameClassRoom) {
        this.nameClassRoom = nameClassRoom;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id='" + id +
                ", nameClassRoom='" + nameClassRoom +
                ", teacherId='" + teacherId +
                '}';
    }
}
