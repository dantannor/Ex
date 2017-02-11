package Strategy.CreditCard;

/**
 * Created by Daniel on 2/11/2017.
 */
public class CreditCard {
    private ValidationStrategy strategy;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public ValidationStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }



    public boolean isValid(){
        return strategy.isValid(this);
    }
}
