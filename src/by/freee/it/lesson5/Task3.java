package by.freee.it.lesson5;

public class Task3 {
    public static void main(String[] args) {
        String text = "apple\nbox\nball\nmom\ndoor\nmem\ntea\nmadam";
        String[] words = text.split("\n");
        System.out.println("Source list: \n" + text);
        System.out.println();
        System.out.println("Palindromes: ");
        for (int i = 0, flag = 0; i < words.length; i++) {
            String box = words[i];
            for (int j = 0, k = box.length() - 1; j < box.length(); j++, k--) {
                if (box.charAt(j) != box.charAt(k))
                    break;
                else
                    flag++;
            }
            if (flag == box.length()) {
                System.out.println(box);
            }
            flag = 0;
        }

    }
}
