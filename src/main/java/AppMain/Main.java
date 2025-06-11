package AppMain;

import Observable.StockAgent;
import Observer.AgentCaptainTed;
import Observer.AgentWolf;
import Observer.Observer;

public class Main {
    public static void main(String[] args) {
        StockAgent agent = new StockAgent();

        Observer agency1 = new AgentWolf("Agency A");
        Observer agency2 = new AgentCaptainTed("Agency B");

        agent.addObserver(agency1);
        agent.addObserver(agency2);

        agent.changeStockState("RISING");
        System.out.println("---");
        agent.changeStockState("FALLING");
        System.out.println("---");
        agent.removeObserver(agency2);
        agent.changeStockState("RISING");
    }
}
