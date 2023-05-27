package pizza;

public class OutParisDeliveryCalculator implements DeliveryPlanCalculator {
    @Override
    public double priceFor(Pizza pizza) {
        return pizza.getPrice()*1.1;
    }
}
