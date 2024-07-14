package solid.OCP_principle;


// O - Open-closed principle
//  * Принцип открытости\закрытости
//  * Этот принцип означает, что классы должны быть открыты для расширения, но закрыты для модификации.
//  * Иными словами - можно добавлять новый функционал, но нельзя изменять уже существующий.


public class ClientMain {
    public static void main(String[] args) {
        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SilverPartner().getDiscount(100));
        System.out.println(new VIPPartner().getDiscount(100));
    }
}
