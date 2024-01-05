package Lesson3_Seminar;
import java.util.ArrayList;
import java.util.List;

/*Каталог товаров книжного магазина сохранен в виде двумерного списка
List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
содержится название жанра, а на остальных позициях - названия книг.
Напишите метод для заполнения данной структуры.
 */

public class test_3 {
    public static void main(String[] args) {
        List<List<String>> catalog = new ArrayList<>();
        addBook(catalog, "adventure", "LOTR");
        addBook(catalog, "roman", "Мастер и Маргарита");
        addBook(catalog, "politic", "Государь");
        addBook(catalog, "adventure", "Hobbit");
        System.out.println(catalog);
    }

    static void addBook(List<List<String>> catalog, String genre, String name) {
        for (int i = 0; i < catalog.size(); i++) {
            List<String> innerCatalog = catalog.get(i);
            if (innerCatalog.get(0).equals(genre)) {
                innerCatalog.add(name);
                return;
            }
        }
        List<String> newInnerCatalog = new ArrayList<>();
        newInnerCatalog.add(genre);
        newInnerCatalog.add(name);
        catalog.add(newInnerCatalog);
    }
}
