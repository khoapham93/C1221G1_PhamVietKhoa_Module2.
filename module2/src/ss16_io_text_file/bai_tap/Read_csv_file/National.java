package ss16_io_text_file.bai_tap.Read_csv_file;

public class National {
    private int id;
    private String code;
    private String national;

    public National(int id, String code, String national) {
        this.id = id;
        this.code = code;
        this.national = national;
    }

    public National() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return  "id: " + id +
                ", code: " + code +
                ", national: " + national;
    }

}
