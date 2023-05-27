package pizza;

public enum DeliveryPlan02 {
    TO_GO{
        @Override
        public Double getCost(Pizza pizza) {
            return pizza.getPrice()*0.9;
        }
    },
    IN_PARIS{
        @Override
        public Double getCost(Pizza pizza) {
            return pizza.getPrice()*1.05;
        }
    },
    OUTSIDE_PARIS{
        @Override
        public Double getCost(Pizza pizza) {
            return pizza.getPrice()*1.1;
        }
    };

    public Double getCost(Pizza pizza){
        return pizza.getPrice()*1.05;
    }
}
