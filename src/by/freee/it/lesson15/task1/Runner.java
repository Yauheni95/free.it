package by.freee.it.lesson15.task1;

public class Runner {
    public static void main(String[] args) {
        MyConsumer<String> consumer = System.out::println;
        MyConsumer<Integer> consumer1 = System.out::println;
        Integer integer = 10;
        String string = "hello";
        consumer.display(string);
        consumer1.display(integer);
    }

    @FunctionalInterface
    interface MyConsumer<T> {
        void display(T t);
    }
}
