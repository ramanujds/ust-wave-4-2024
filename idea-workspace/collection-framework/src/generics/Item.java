package generics;

import java.util.StringJoiner;

public class Item<T> {

    private T value;

    public Item(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
                .add("value='" + value + "'")
                .toString();
    }
}
