package attest_java;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Set<Note> note = new HashSet<>();
        Note note1 = new Note();
        note1.brand = "Asus";
        note1.volume_ssd = 512;
        note1.ozu = 16;
        note1.price=52_700;
        note1.opersysyem="Windows";

        Note note2 = new Note();
        note2.brand = "MacBook Pro";
        note2.volume_ssd = 1000;
        note2.ozu = 16;
        note2.price=219_000;
        note2.opersysyem="MacOs";

        Note note3 = new Note();
        note3.brand = "Microsoft";
        note3.volume_ssd = 256;
        note3.ozu = 8;
        note3.price=34_999;
        note3.opersysyem="Windows";

        Note note4 = new Note();
        note4.brand = "Asus";
        note4.volume_ssd = 256;
        note4.ozu = 8;
        note4.price=42_900;
        note4.opersysyem="Windows";

        Note note5 = new Note();
        note5.brand = "MacBook Air";
        note5.volume_ssd = 512;
        note5.ozu = 8;
        note5.price=92_500;
        note5.opersysyem="MacOs";

        Note note6 = new Note();
        note6.brand = "Asus";
        note6.volume_ssd = 512;
        note6.ozu = 16;
        note6.price=62_700;
        note6.opersysyem="Windows";

        note.add(note1);
        note.add(note2);
        note.add(note3);
        note.add(note4);
        note.add(note5);
        note.add(note6);

        System.out.println("1-Поиск");
        System.out.println("2-ОЗУ");
        System.out.println("3-Объем ссд");
        System.out.println("4-Цена");
        System.out.println("5-Операционная система");

        Scanner scanner = new Scanner(System.in);
        Map<String,Object> filter = new HashMap<>();
//        int[] userchase = new int[];
         boolean flag = true;
         while(flag){
             System.out.println("Введите цифру Фильтра: ");
             int user_input = scanner.nextInt();
             switch(user_input) {
                 case 1:
                     flag=false;
                     break;
                 case 2:
                     System.out.println("Минимальный объем ОЗУ? ");
                     System.out.println("8 Gb");
                     System.out.println("16 Gb");
                     System.out.println("Введите объем: ");
                     filter.put("ozu",scanner.nextInt());
                     break;
                 case 3:
                     System.out.println("Минимальный объем ссд? ");
                     System.out.println("256 Gb");
                     System.out.println("512 Gb");
                     System.out.println("1000 Gb");
                     System.out.println("Введите объем: ");
                     filter.put("volume_ssd",scanner.nextInt());
                     break;
                 case  4:
                     System.out.println("Минимальная цена? ");
                     System.out.println("30_000 ₽");
                     System.out.println("50_000 ₽");
                     System.out.println("100_000 ₽");
                     System.out.println("Введите цену: ");
                     filter.put("price",scanner.nextInt());
                     break;
                 case 5:
                     System.out.println("Os? ");
                     System.out.println("Windows");
                     System.out.println("MacOs");
                     System.out.println("Введите название: ");
                     filter.put("opersysyem",scanner.next());
                     break;
                 default:
                     System.out.println("Неверн введено число или название, попрбуйте снова.");

             }
         }
         Set<Note> filterlaptop = note.stream()
                 .filter(notes-> filter.getOrDefault("ozu",0) instanceof Integer && notes.ozu>=(int) filter.getOrDefault("ozu",0))
                 .filter(notes-> filter.getOrDefault("volume_ssd",0) instanceof Integer && notes.volume_ssd>=(int) filter.getOrDefault("volume_ssd",0))
                 .filter(notes-> filter.getOrDefault("price",0) instanceof Integer && notes.price>=(int) filter.getOrDefault("price",0))
                 .filter(notes-> filter.getOrDefault("opersysyem","").equals("") || notes.opersysyem.equalsIgnoreCase((String) filter.getOrDefault("opersysyem","")))
                 .collect(Collectors.toSet());
        System.out.println("Отфильтрованные ноутбуки: ");
        for(Note notes:filterlaptop){
            System.out.println(notes);
        }
    }

}
