import java.io.*;
import java.nio.file.*;

public class task1 {
    public static void writeToFile(String fileName, String data) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("Data successfully written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public static void appendToFile(String fileName, String data) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("\n" + data);
            System.out.println("Data successfully appended to " + fileName);
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "firsttask.txt";
        try{
            File file=new File(fileName);
            if(file.createNewFile()){
                System.out.println("File Created: "+file.getName());
            }
            else{
                System.out.println("File already Exits.");
            }
        String original= "This is the First task in CODTECH IT solutions";
        String additional= "This is task is about File handling utility";
        writeToFile(fileName, original);
        readFromFile(fileName);
        appendToFile(fileName, additional);
        readFromFile(fileName);
        }
        catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();

        }
        }
    }
