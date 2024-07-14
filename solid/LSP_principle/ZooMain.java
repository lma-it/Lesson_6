package solid.LSP_principle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * L - Liskov substitution principle
 * Принцип подстановки Барбары Лисков
 * Данный принцип означает, что необходимо так продумать логику наследования, чтоб все наследники могли иметь функционал базового класса,
 * или даже расширять его, но при изменении функционала, чтоб код не ломался.
 */

public class ZooMain {
    public static void main(String[] args) {
        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Python()));

        for (AbstractAnimal abstractAnimal : list1) {
            System.out.println(abstractAnimal.getType());
        }

        List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog()/* new Python() */));

        for (Legs legs : list2) {
            System.out.println(legs.getLegsCount());
        }
    }
}
