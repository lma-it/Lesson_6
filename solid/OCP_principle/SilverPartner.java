package solid.OCP_principle;

public class SilverPartner extends BaseClient{
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}
