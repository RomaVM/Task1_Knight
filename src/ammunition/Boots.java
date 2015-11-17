package ammunition;

public class Boots extends Ammunition{

    private String name;
    private int speed;
    private Integer size;

    public Boots(double cost, double weight,
                 String name, int speed, Integer size) {
        super(cost, weight);
        this.name = name;
        this.speed = speed;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", size='" + size + '\'' +
                super.toString() +
                '}';
    }
}
