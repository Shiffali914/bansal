package jan25.Generic;

public class Box <T,R>{
        T length;
        R widht;

    public Box(T length, R widht) {
        this.length = length;
        this.widht = widht;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public R getWidht() {
        return widht;
    }

    public void setWidht(R widht) {
        this.widht = widht;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", widht=" + widht +
                '}';
    }
}
