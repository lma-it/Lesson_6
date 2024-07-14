package solid.ISP_principle;

public class IPhone implements Email{

    @Override
    public void Call() {
        System.out.println("I Call You form IPhone");
    }

    @Override
    public void SendSMS() {
        System.out.println("I wrote You my SMS form IPhone");
    }

    @Override
    public void SendEmail() {
        System.out.println("i sent You my Email form IPhone");
    }

    @Override
    public void SendFax() {
        System.out.println("I send to You new Fax form IPhone");
    }
    
}
