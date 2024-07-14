package solid.SRP_principle;

// S - single responsibility principle
//  * Приницип единственной ответственности.
//  * Один класс решает только одну поставленную задачу. И только эта задача может быть причиной изменений в этом классе.
//  * Если этот класс решает свою задачу хорошо, но не может делать это с другим классом, то пересматривать надо логику другого класса.


public class PlannerMain {
    public static void main(String[] args) {
        Planner planner = new Planner();
        planner.addEntry("1");
        planner.removeEntry(0);


        DataManager dm = new DataManager();
        dm.saveAllText(planner, "srp.txt");
    }
}
