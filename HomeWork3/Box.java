package HomeWork3;

import java.util.Iterator;

public class Box implements Iterator {
    private static Integer id;
    static {
        id = 0;
    }
    private Integer idBox;
    private Integer weight;
    private int count;

    public Box(Integer weight) {
        this.idBox = ++id;
        this.weight = weight;
    }

    @Override
    public boolean hasNext() {
        return count++ < 2;
    }

    @Override
    public Object next() {
        switch (count) {
        case 1:
            return String.format("ID this box is: %s ", id);
        default:
            return String.format("Weight this box is: %s ", weight);
        }
    }
    @Override
    public String toString() {
        return "Box{" +
                "idBox=" + idBox +
                ", weight=" + weight +
                '}';
    }

    public Integer getId() {
        return idBox;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

}
