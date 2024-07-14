package solid.LSP_principle;

public class Dog extends AbstractAnimal implements Legs {


    @Override
    public int getLegsCount() {
        return 4;
    }


    @Override
    public String getType() {
        return "Собака";
    }
    
}
