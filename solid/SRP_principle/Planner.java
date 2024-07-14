package solid.SRP_principle;

import java.util.ArrayList;
import java.util.List;

public class Planner {
    List<String> entires = new ArrayList<>();

    public void addEntry(String text){
        entires.add(text);
    }

    public void removeEntry(int index){
        entires.remove(index);
    }

    @Override
    public String toString() {
        return String.join("\n", entires);
    }

}
