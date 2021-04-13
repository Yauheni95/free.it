package by.freee.it.FromMetodichka.Task28;

public class MyClass<T> {

    T[] array;


    public MyClass(T[] array) {
        this.array = array;
    }

    public MyClass(int[] array) {
        Integer[] array1 = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        this.array = (T[]) array1;
    }

    public MyClass(double[] array) {
        Double[] array1 = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        this.array = (T[]) array1;
    }

    public MyClass(long[] array) {
        Long[] array1 = new Long[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        this.array = (T[]) array1;
    }

    public T[] getArray() {
        return array;
    }

    public T get(int index) {
        return this.array[index];
    }
}
