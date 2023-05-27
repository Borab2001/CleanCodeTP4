package pizza;

public class ToGoDeliveryPriceCalculator implements DeliveryPlanCalculator{
    @Override
    public double priceFor(Pizza pizza) {
        return pizza.getPrice()*0.9;
    }
}
