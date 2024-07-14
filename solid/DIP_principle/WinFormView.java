package solid.DIP_principle;

public class WinFormView implements View{

    @Override
    public void print(String text) {
        String result = String.format("WinFormView %s", text);
        System.out.println(result);
    }
    
}
