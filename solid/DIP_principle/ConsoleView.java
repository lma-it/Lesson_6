package solid.DIP_principle;

public class ConsoleView implements View{

    @Override
    public void print(String text) {
        String result = String.format("ConsoleView %s", text);
        System.out.println(result);
    }
    
}
