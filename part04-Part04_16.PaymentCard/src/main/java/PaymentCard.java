import java.util.Locale;

public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (balance - 2.60 < 0) {
            return;
        }
        this.balance -= 2.60;
        
    }

    public void eatHeartily() {
        if (balance - 4.60 < 0) {
            return;
        }
        this.balance -= 4.60;
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        if (balance + amount > 150) {
            this.balance = Math.min(this.balance + amount, 150);
            return;
        }
        this.balance += amount;
    }

    public String toString() {
        return String.format(Locale.US,"The card has a balance of %s euros", balance);
    }
}
