
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        money = 1000;
    }

    public double eatAffordably(double payment) {
        double MEAL = 2.50;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < MEAL) {
            return payment;
        }
        money += MEAL;
        affordableMeals++;

        return payment - MEAL;
    }

    public double eatHeartily(double payment) {
        double MEAL = 4.30;
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < MEAL) {
            return payment;
        }
        money += MEAL;
        heartyMeals++;

        return payment - MEAL;
    }

    public boolean eatAffordably(PaymentCard card) {
        double MEAL = 2.50;
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() < MEAL) {
            return false;
        }
        card.takeMoney(MEAL);
        affordableMeals++;

        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        double MEAL = 4.30;
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() < MEAL) {
            return false;
        }
        card.takeMoney(MEAL);
        heartyMeals++;

        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0){
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
