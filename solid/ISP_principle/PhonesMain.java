package solid.ISP_principle;


/*
 * I - Interface segregation principle
 * Принцип разделения интерфейсов
 * Гласит о том, что должны использоваться только те интерфейсы в классах, которые нужны, а не все сразу, или не далеть весь функционал
 * в один интерфейс, а лучше разделить все по мере необходимости.
 */
public class PhonesMain {
    public static void main(String[] args) {
        new IPhone().Call();
        new IPhone().SendEmail();
        new IPhone().SendSMS();
        new IPhone().SendFax();

        new Nokia3331().Call();
        new Nokia3331().SendSMS();

    }
}
