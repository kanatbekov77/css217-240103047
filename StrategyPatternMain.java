
interface MovementStrategy {
    void move();
}

class Walking implements MovementStrategy {
    public void move() {
        System.out.println("Walking: 5 km/h");
    }
}

class Skateboarding implements MovementStrategy {
    public void move() {
        System.out.println("Skateboarding: 15 km/h");
    }
}

class Jetpack implements MovementStrategy {
    public void move() {
        System.out.println("Jetpack: 60 km/h");
    }
}

class Player {
    private MovementStrategy strategy;

    public Player(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void setMovementStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void move() {
        strategy.move();
    }
}

public class StrategyPatternMain {
    public static void main(String[] args) {
        Player player = new Player(new Walking());

        player.move();

        System.out.println("Switching to Jetpack!");

        player.setMovementStrategy(new Jetpack());

        player.move();
    }
}
