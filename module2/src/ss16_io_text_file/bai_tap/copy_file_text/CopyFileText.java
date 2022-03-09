package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    static final String RESOURCE_FILE = "src\\ss16_io_text_file\\bai_tap\\copy_file_text\\ResourceFile.txt";
    static final String TARGET_FILE = "src\\ss16_io_text_file\\bai_tap\\copy_file_text\\TargetFile.txt";

    public static void main(String[] args) {
        List<String> sourceFile = readTextFile(RESOURCE_FILE);
        writeToTextFile(sourceFile,TARGET_FILE,true);
        System.out.println("File copied!");
    }
    public static List<String> readTextFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
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
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static void writeToTextFile(List<String> stringList,String pathFile,boolean append){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileWriter = new FileWriter(file,append);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (String s: stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

