package by.freee.it.FromMetodichka.Task34FromMetodichka;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task34FromMetodichka {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File file = new File("src//by//freee//it//FromMetodichka//Task34FromMetodichka//text321.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int res = fileReader.read();
            while (res != -1) {
                sb.append((char) res);
                res = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
        Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher = pat.matcher(sb);
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            sum += Integer.parseInt(matcher.group());
            list.add(Integer.parseInt(matcher.group()));
        }
        System.out.println("\n" + sum + " sum");
        sum = 0;
        Set<Integer> set = new HashSet<>(list);
        for (Integer a : set) {
            System.out.print(a + " ");
            sum += a;
        }
        System.out.println("\n" + sum + " sum");
    }
}
