package feb10;

public interface List {
    void add(Integer e) throws EmptyElementException;
    void delete(int index) throws IndexOutOfBoundsException;
    Integer pop();
    Integer get(int index) throws IndexOutOfBoundsException;
    int size();
}
