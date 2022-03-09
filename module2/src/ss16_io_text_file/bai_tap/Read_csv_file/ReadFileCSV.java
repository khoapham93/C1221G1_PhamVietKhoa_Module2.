package ss16_io_text_file.bai_tap.Read_csv_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    final static String NATIONAL_FILE = "src\\ss16_io_text_file\\bai_tap\\Read_csv_file\\National.csv";

    public static void main(String[] args) {
        List<National> nationalList = readNationalFromCSV(NATIONAL_FILE);
        System.out.println("List of national in csv file");
        for (National national : nationalList) {
            System.out.println(national);
        }
    }

    public static List<National> readNationalFromCSV(String pathFile) {
        List<National> nationalList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] nationalString = null;
            int id = -1;
            String code = null;
            String nationalName = null;
            while ((line = bufferedReader.readLine()) != null) {
                nationalString = line.split(",");
                id = Integer.parseInt(nationalString[0]);
                code = nationalString[1];
                nationalName = nationalString[2];

                National national = new National(id, code, nationalName);
                nationalList.add(national);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nationalList;
    }
}
