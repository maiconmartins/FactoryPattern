package factory;

import cards.Card;
import cards.Maestro;
import cards.Mastercard;
import cards.Visa;

public class CardFactory {

    public static Card getCard(String type, int number, String name, int cvv) {
        if (type.equals("visa")) {
            return new Visa(number, name, cvv);
        } else if (type.equals("mastercard")) {
            return new Mastercard(number, name, cvv);
        } else if (type.equals("maestro")) {
            return new Maestro(number, name, cvv);
        } else {
            return null;
        }
    }

}
