package solid.ISP_principle;

public class Nokia3331 implements BasePhone{

    @Override
    public void Call() {
        System.out.println("I Call You from Nokia3331");
    }

    @Override
    public void SendSMS() {
        System.out.println("I wrote to You my SMS from Nokia3331");
    }
    
}
