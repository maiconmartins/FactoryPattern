package abstractfactory;

import cards.Card;
import cards.Mastercard;

public class MastercardFactory implements CardAbstractFactory {

    private int number;
    private String name;
    private int cvv;

    public MastercardFactory(int number, String name, int cvv) {
        this.number = number;
        this.name = name;
        this.cvv = cvv;
    }

    @Override
    public Card createCard() {
        // TODO Auto-generated method stub
        return new Mastercard(number, name, cvv);
    }
}
