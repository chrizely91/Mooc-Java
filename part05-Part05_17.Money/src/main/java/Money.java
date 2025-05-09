


public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int thisInCents = (this.euros * 100) + this.cents;
        int additionInCents = (addition.euros * 100) + addition.cents;
        
        Money newMoney = new Money(0, thisInCents + additionInCents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int thisDinheiro = (this.euros *100) + this.cents;
        int comparedDinheiro = (compared.euros *100) + compared.cents;

        return thisDinheiro < comparedDinheiro;
    }

    public Money minus(Money decreaser) {
        int thisInCents = (this.euros * 100) + this.cents;
        int decreaserInCents = (decreaser.euros * 100) + decreaser.cents;
        
        int difference = thisInCents - decreaserInCents;
        
        if (difference < 0) {
            return new Money(0, 0);
        }

        Money newMoney = new Money(0, difference);

        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
