package lambda;

public interface Operation <T> {
    T getResult(T value1, T value2);
}
