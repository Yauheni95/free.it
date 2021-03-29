package by.freee.it.lesson5.Task4;


public class Main {
    public static void main(String[] args) {
        String text = "Three main entry points were analysed: entry level, middle level and senior level. "+
                      "I think it will be the only way we will do our shopping in the future! "+
                      "He actually thinks you did the deed. "+
                      "There is my house. "+
                      "There is the house where my family lives. "+
                      "We go jogging every Sunday. "+
                      "Lost comms plan comes into effect as of noon. ";

        String[] sourceArray = text.split("(?<=[.?!])");
        int count = 0;
        System.out.println("Source Text: "+sourceArray.length+" sentences");
        for (String a : sourceArray
        ) {
            System.out.print(a);
            if (TextFormater.countWords(a) >= 3 && TextFormater.countWords(a) <= 5 || TextFormater.hasPalindrom(a))
                count++;
        }

        String[] resultingArray = new String[count];

        for (int i = 0, j=0; i < sourceArray.length&&j<resultingArray.length; i++) {
            if (TextFormater.countWords(sourceArray[i]) >= 3 && TextFormater.countWords(sourceArray[i]) <= 5 || TextFormater.hasPalindrom(sourceArray[i])){
                resultingArray[j] = sourceArray[i];
            j++;}
        }


        System.out.println("\n\nResulting Text: "+resultingArray.length+" sentences");

        for (String b : resultingArray
        ) {
            System.out.print(b);
        }


    }

}

