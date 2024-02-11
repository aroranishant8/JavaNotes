package Lambda;

public class Apple {
    String color;
    int weight;

    public Apple(String color, int weight) {
        this.color=color;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
