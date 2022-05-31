package abstractfactory;

import cards.Card;
import cards.Maestro;

public class MaestroFactory implements CardAbstractFactory {

    private int number;
    private String name;
    private int cvv;

    public MaestroFactory(int number, String name, int cvv) {
        this.number = number;
        this.name = name;
        this.cvv = cvv;
    }

    @Override
    public Card createCard() {
        // TODO Auto-generated method stub
        return new Maestro(number, name, cvv);
    }

}
