public class GenericContainer<T> implements Container<T>{

    private T item;

    @Override
    public void setValue(T value) {
        this.item = value;
    }

    @Override
    public T getValue() {
        return item;
    }
}
