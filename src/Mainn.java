import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Mainn {

    static Map<String,String> map = new LinkedHashMap<>();
    public static void main(String[] args){
        String filePathSource = "src/test.txt";
        String filePathSource1 = "src/test1.txt";
        try {
            fileread(filePathSource);
            writetofile(filePathSource1);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось считать файл");
        }
        catch (IOException e ){
            System.out.println("Не удалось записать в файл");
        }

    }
    static void writetofile(String filepath) throws IOException{
        try(FileWriter writer = new FileWriter(filepath)){
            for (Map.Entry<String,String> entry: map.entrySet()){
                writer.write(entry.toString());
                writer.write("\n");
            }
        }
    }
    static void fileread(String filepath) throws FileNotFoundException{
        File file = new File(filepath);
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] arr = line.split("=");
                if(arr[1].equals("?")){
                    arr[1]=String.valueOf(arr[0].length());
                }
                map.put(arr[0],arr[1]);
            }
        }
    }

}
