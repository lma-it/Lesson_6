package solid.OCP_principle;

public class VIPPartner extends SilverPartner{
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}
