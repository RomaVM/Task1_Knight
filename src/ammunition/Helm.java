package ammunition;

public class Helm extends Ammunition {

    private String name;
    private int absorbeDamage;
    private String size;

    public Helm(double cost, double weight,
                String name, int absorbeDamage, String size) {
        super(cost, weight);
        this.name = name;
        this.absorbeDamage = absorbeDamage;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbsorbeDamage() {
        return absorbeDamage;
    }

    public void setAbsorbeDamage(int absorbeDamage) {
        this.absorbeDamage = absorbeDamage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "name='" + name + '\'' +
                ", absorbeDamage=" + absorbeDamage +
                ", size='" + size + '\'' +
                super.toString() +
                '}';
    }
}
