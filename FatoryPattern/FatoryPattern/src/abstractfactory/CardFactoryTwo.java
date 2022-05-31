package abstractfactory;

import cards.Card;

public class CardFactoryTwo {

    public static Card getCard(CardAbstractFactory factory) {
        return factory.createCard();
    }

}
