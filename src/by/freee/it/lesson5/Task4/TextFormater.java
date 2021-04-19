package by.freee.it.lesson5.Task4;


public class TextFormater {
    public static int countWords(String sentence) {
        String[] words = sentence.split("\\W+");
        return words.length;

    }

    public static boolean hasPalindrom(String sentence) {
        String[] words = sentence.split("\\W+");
        int flag = 0;

        for (String box : words) {
            for (int j = 0, k = box.length() - 1; j < box.length()/2; j++, k--) {
                if (box.charAt(j) != box.charAt(k))
                    break;
                else
                    flag++;
            }
            if (flag == box.length()/2&&flag>2) {
                flag = -1;
                break;
            }
            flag = 0;

        }
        return flag == -1;
    }

}
