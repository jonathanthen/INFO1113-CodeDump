public class Container<T> {
    private T element;

    public Container(T element) {
        this.element = element;
    }

    public boolean isNull() {
        if (element == null) {
            return true;
        }
        return false;
    }

    public T set(T element) {
        T temp = this.element;
        this.element = element;
        return temp;
    }

    public T get() {
        return element;
    }
}