package Lesson2_Seminar;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой
итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt'
 в формате год-месяц-день час:минуты {массив на данной итерации}.
 Для логирования использовать логгер logger класса BubbleSort.
 */
public class DZ_2 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        String logPath="src/Lesson2_Seminar/logdz2.txt";
        int [] arr ={9, 4, 8, 3, 1};
        logg(logPath);
        sort(arr);
        closeLogger();
    }
    static void sort(int[] arr){
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        logger.info("Элемент успешно сортирован");
                    }
                }
            }
            logger.info("Массив успешно отсортирован");
            System.out.println(Arrays.toString(arr));
        }catch (Exception e){
            e.printStackTrace();
            logger.warning("Запись в файл не удалась. " + e.getMessage());
        }
    }
    static void logg(String logPath){
        SimpleFormatter formatter = new SimpleFormatter();
        try {
            FileHandler handler= new FileHandler(logPath,true);
            logger.addHandler(handler);
            handler.setFormatter(formatter);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }
}
