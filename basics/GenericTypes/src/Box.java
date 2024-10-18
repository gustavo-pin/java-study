public class Box<T> {
    private final T t;

    Box(T type) {
        this.t = type;
    }

    public T getT() {
        return this.t;
    }
}
