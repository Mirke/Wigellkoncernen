import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SingletonWriter {

    private static  SingletonWriter instance;

    private SingletonWriter() {
    }

    public static SingletonWriter getInstance(){
        if(instance == null){
            instance = new SingletonWriter();
        }
        return instance;
    }

    public void read(String filePath)  {
        try {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public String getFullList(String filePath){
        String fullText = "";
        try{
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                fullText += scanner.nextLine() + "\n";
            }
            return fullText;
    } catch (Exception e) {
        e.printStackTrace();
    }
        return "";
}


    public void write(String filePath, String text) {
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            String firstLine = scanner.nextLine();
            String[] numberStr = firstLine.split(" ");
            int number = Integer.parseInt(numberStr[0]);
            number += 1;
            FileWriter writer = new FileWriter(file);
            writer.write(number + " " + text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
