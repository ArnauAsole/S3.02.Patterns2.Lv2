package Observer;

public class AgentWolf implements Observer {
    private String name;

    public AgentWolf(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: Stock market is " + message);
    }
}
