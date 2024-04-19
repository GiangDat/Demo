import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String File_Name = "abc.txt";

    public static void main(String[] args) {
        // ghi file
        try {
            FileWriter fileWrite = new FileWriter(File_Name, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
            bufferedWriter.write("xin chào bạn");
            bufferedWriter.newLine();
            bufferedWriter.write("tạm biệt cả lớp");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        // đọc file
        List<String> List = new ArrayList<>();
        try {
            FileReader fileRead = new FileReader(File_Name);
            BufferedReader bufferedReader = new BufferedReader(fileRead);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                List.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(List);
    }
}