package by.freee.it.FromMetodichka.Task36FromMetodichka;

import java.io.File;
import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src//by//freee//it//FromMetodichka");
        File[] list = file1.listFiles();
        System.out.println("Files:");
        for (File a : list) {
            if (a.isFile())
                System.out.print(a.getName() + " | ");
        }
        System.out.println("\nDirectories: ");
        for (File a : list) {
            if (a.isDirectory())
                System.out.print(a.getName() + " | ");
        }
    }
}
