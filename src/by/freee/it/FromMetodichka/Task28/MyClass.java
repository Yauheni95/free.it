package by.freee.it.FromMetodichka.Task28;

public class MyClass<T> {

    T[] array;

    public MyClass(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T get(int index) {
        return this.array[index];
    }
}
