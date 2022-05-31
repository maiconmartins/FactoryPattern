
import abstractfactory.CardFactoryTwo;
import abstractfactory.MastercardFactory;
import abstractfactory.VisaFactory;
import cards.Card;
import cards.Visa;
import factory.CardFactory;

public class MainWeek3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Card myCard = CardFactory.getCard("visa", 1234567, "Amilcar Aponte", 321);

        Card mySecondCard = CardFactoryTwo.getCard(new MastercardFactory(1248567, "Graham Glanville", 321));

        System.out.println(myCard);
        System.out.println(mySecondCard);
    }

}
