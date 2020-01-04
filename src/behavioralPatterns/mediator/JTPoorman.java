package behavioralPatterns.mediator;

public class JTPoorman extends Colleague{

    public JTPoorman(Mediator newMediator) {
        super(newMediator);

        System.out.println("JTPoorman signed up for the stock exchange\n");

    }
}
