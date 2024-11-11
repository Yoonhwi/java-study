public class Car {
    private final String name;
    private int position;

    // JAVA에서는 constructor를 사용하지않고 클래스 이름과 같은 이름을 사용!
    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        position++;
    }
}
