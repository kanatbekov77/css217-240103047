
interface Pizza {
    String getDescription();
    double getCost();
}

class PlainPizza implements Pizza {
    public String getDescription() {
        return "Plain Dough & Sauce";
    }

    public double getCost() {
        return 5.0;
    }
}

class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", + Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}

class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", + Olives";
    }

    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}

class Pineapple extends PizzaDecorator {
    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", + Pineapple";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}

abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

public class DecoratorPatternMain {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);
        pizza = new Pineapple(pizza);

        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Total cost: $" + pizza.getCost());
    }
}
