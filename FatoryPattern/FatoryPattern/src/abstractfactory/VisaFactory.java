package abstractfactory;

import cards.Card;
import cards.Visa;

public class VisaFactory implements CardAbstractFactory {

    private int number;
    private String name;
    private int cvv;

    public VisaFactory(int number, String name, int cvv) {
        this.number = number;
        this.name = name;
        this.cvv = cvv;
    }

    @Override
    public Card createCard() {
        // TODO Auto-generated method stub
        return new Visa(number, name, cvv);
    }
}
