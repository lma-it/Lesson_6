package solid;
import static print_module.print_library.println;

/**
 * SOLID:
 * 
 * S - single responsibility principle
 * Приницип единственной ответственности
 * Один класс решает только одну поставленную задачу. И только эта задача может быть причиной изменений в этом классе.
 * Если этот класс решает свою задачу хорошо, но не может делать это с другим классом, то пересматривать надо логику другого класса.
 * 
 * O - Open-closed principle
 * Принцип открытости\закрытости
 * 
 * L - Liskov substitution principle
 * Принцип подстановки Лискова
 * 
 * I - Interface segregation principle
 * Принцип разделения интерфейсов
 * 
 * D - Dependency inversion principle
 * принцип инверсии зависимостей
 */

/**
 * Task1
 */

public class Task1 {

    public static void main(String[] args) {
        println("Hello");
    }
}