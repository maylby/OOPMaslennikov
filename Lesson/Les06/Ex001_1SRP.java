package OOP.Lesson.Les06;

import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

public class Ex001_1SRP {
    public static void main(String[] args) {
        Planner revengePlanner = new Planner();
        revengePlanner.addEntry("1");
        revengePlanner.removeEntry(0);
        revengePlanner.saveAllText("path");
        revengePlanner.loadFromDB("10.0.0.0","admin","1234");
    }
}

/*
 * Класс "Planner" (планировщик)
 * для ведения и систематизации каких-либо записей
 */
class Planner {

    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    }
    public void removeEntry(int index) {
        entries.remove(index);
    }

    // Метод прегрузки для записной книжки
    @Override
    public String toString() {
        return String.join("\n", entries);
    }

    // Сохранить данные в файл
    public void saveAllText(String path) {
        /// ошибки связанные с...
    }
    
    // Загрузить данные из файла
    public void loadFromFile(String path) {
        /// ошибки связанные с...
    }

    // Загрузить из базы данных  
    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с...
    }
}
