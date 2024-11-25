import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountryReader {
    public static void main(String[] args) {
        String filePath = "D:\\CodeGym\\Module2\\read-file-csv\\country.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            //Doc tung dong cua file
            while ((line = br.readLine()) != null) {
                //Su dung phuong thuc split de phan tach cac cot
                String[] columns = line.split(",");
                //In ra thong tin country
                String id = columns[0].trim();
                String code = columns[1].replace("\\", "").trim();//Loai bo dau ngoac kep
                String name = columns[2].replace("\\", "").trim();
                System.out.println("ID: " + id + ", Code: " + code + ", Name: " + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
