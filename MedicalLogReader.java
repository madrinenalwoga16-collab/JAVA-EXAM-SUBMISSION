import java.io.*;

public class MedicalLogReader {

    public static void main(String[] args) {

        File medicalLogFile = new File("medicalLog.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(medicalLogFile))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
