package pizza;

import java.util.function.Function;

public enum DeliveryPlan03 {
    TO_GO("A emporter", pizza-> pizza.getPrice()*0.9),
    IN_PARIS("Dans Paris", pizza-> pizza.getPrice()*1.05),
    OUTSIDE_PARIS("Hors de Paris", pizza-> pizza.getPrice()*1.1);

    private String label;

    public Function<Pizza, Double> deliveryPrice ;

    public String getLabel() {
        return label;
    }

    public Function<Pizza, Double> getDeliveryPrice() {
        return deliveryPrice;
    }

    DeliveryPlan03(String label, Function<Pizza, Double> deliveryPrice){
        this.label = label;
        this.deliveryPrice = deliveryPrice;
    }
}

