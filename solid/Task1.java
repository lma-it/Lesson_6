package solid;
import static print_module.print_library.println;

/**
 * SOLID:
 * 
 * S - single responsibility principle
 * Приницип единственной ответственности.
 * Один класс решает только одну поставленную задачу. И только эта задача может быть причиной изменений в этом классе.
 * Если этот класс решает свою задачу хорошо, но не может делать это с другим классом, то пересматривать надо логику другого класса.
 * 
 * O - Open-closed principle
 * Принцип открытости\закрытости
 * Этот принцип означает, что классы должны быть открыты для расширения, но закрыты для модификации.
 * Иными словами - можно добавлять новый функционал, но нельзя изменять уже существующий.
 * 
 * L - Liskov substitution principle
 * Принцип подстановки Барбары Лисков
 * Данный принцип означает, что необходимо так продумать логику наследования, чтоб все наследники могли иметь функционал базового класса,
 * или даже расширять его, но при изменении функционала, чтоб код не ломался.
 * 
 * I - Interface segregation principle
 * Принцип разделения интерфейсов
 * Гласит о том, что должны использоваться только те интерфейсы в классах, которые нужны, а не все сразу, или не далеть весь функционал
 * в один интерфейс, а лучше разделить все по мере необходимости.
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