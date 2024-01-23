package lambda;

public interface SuperConsumer<T, U, V> {
    
    void accept(T t, U u, V v);
}
