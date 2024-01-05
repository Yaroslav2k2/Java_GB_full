package Lesson2_Seminar;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test_4 {
    static Logger logger  = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        String filePath = "src/Lesson2_Seminar/text.txt";
        String s  = "test";
        int n = 10;
        String res = repeat(n,s);
        writeinfile(res,filePath);
    }
    static void writeinfile(String res, String filePath)  {
        FileHandler handler = null;
        SimpleFormatter formatter = new SimpleFormatter();
        try {
            handler= new FileHandler("src/Lesson2_Seminar/log.txt",true);
            logger.addHandler(handler);
            handler.setFormatter(formatter);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileWriter file = new FileWriter(filePath)){
            file.write(res);
            logger.info("Запись успешна");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("Запись не сохранена");
        }
        handler.close();
    }

    static String repeat(int n,String s){
        StringBuilder k = new StringBuilder();
        for (int i = 0; i < n; i++) {
            k.append(s);
            k.append(" ");
        }
        return k.toString();
    }

}
