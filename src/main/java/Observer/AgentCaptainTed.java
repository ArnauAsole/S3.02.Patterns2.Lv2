package Observer;

public class AgentCaptainTed implements Observer {
    private String name;

    public AgentCaptainTed(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: Stock market is " + message);
    }
}
