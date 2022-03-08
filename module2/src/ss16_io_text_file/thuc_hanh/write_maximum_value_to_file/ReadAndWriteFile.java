package ss16_io_text_file.thuc_hanh.write_maximum_value_to_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CODEGYM\\Module2\\module2\\src\\ss16_io_text_file\\thuc_hanh\\write_maximum_value_to_file\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CODEGYM\\Module2\\module2\\src\\ss16_io_text_file\\thuc_hanh\\write_maximum_value_to_file\\result.txt", maxValue);
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
        return numbers;
    }
}
