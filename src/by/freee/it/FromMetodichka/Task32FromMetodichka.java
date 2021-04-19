package by.freee.it.FromMetodichka;

import java.util.*;

public class Task32FromMetodichka {
    /*
    Имеется текст. Следует составить для него частотный словарь.
     */
    public static void main(String[] args) {
        String text = """
                The 2009 British Homes Awards challenged the industry to design a house that can adapt to different life stages.
                The participants were asked to rethink the construction and design of individual homes, so that they were easily adaptable to less mobile inhabitants, and also to create communities in which ageing occupants could continue to enjoy shared amenities.
                The top design also had to be attractive to its potential buyers, because the competition was put to the public vote.
                The winner, gaining 12,000 votes from Mail on Sunday readers, was the strikingly modern SunnySideUp, designed by Kosi Architects. Here are its three main features:
                \s
               
                The architects took as a starting point the accepted norm for a house – rows of houses facing onto streets crammed with cars, with living rooms on the ground floor and bedrooms above. Then they scrapped it.
                They ended up with the living room, dining room and kitchen on the top floor where they can benefit from the light and views, and maximise energy efficiency. And they put the bedrooms on the ground floor where the garden aspect gives inhabitants increased privacy, and a cool temperature is maintained throughout the day. The two floors are linked by wide, gentle gradient stairs, which are designed to allow for a stair lift to be fitted if necessary as owners age.
                \s
               
                But the feature that, according to Warren Rosing, one of the Kosi architects responsible for the design, was particularly popular with the public, is actually the parking.
                In a SunnySideUp development no one has to look out onto a street full of cars, or worry about their kids being run over, because the terrace zone at the first floor level link all the homes and is a car-free zone.
                Vehicles are tucked away on the lower floor, leaving safe and pleasant spaces outside the houses for people to meet, and kids to play.
                A lift takes people directly from garage to living area, so that all residents, including the elderly and those with heavy shopping, can move comfortably between the floors. The natural feel of the front area is enhanced by the planters that are placed outside the kitchens at the front to encourage residents to grow vegetables and flowers where they can be seen.
                The idea is that not only would they look pretty, but they would be a talking point, encouraging interaction between residents on the terrace area outside.
                \s
              
                But it’s the fact that the space is designed to adapt to the changing needs, including the fluctuating income of its owners, that makes it a thought-provoking, as well as a winning, design.
                The lower-floor bedrooms have separate outdoor access so they can be easily l.e t. The idea is that owners can get some extra money to pay for their mortgages during the first years. And later in the future, those bedrooms can be used as a granny flat, or an office, and can easily be converted into a separate one-bed flat if your kids won’t leave home.
                And if more space is required, as well as the usual loft that can be converted, there is potential for a gallery floor to be inserted in the living room.
                \s
              
                At the moment the SunnySideUp house is still just a set of drawings. But Warren Rosing says, “We are hoping to have it built.”
                The organisers are in talks with builders, but due to  the economic climate it may take longer than we would like.”We are sure it will be worth the wait” they say.""";



        String[] words = text.split("\\W+");
        for (int i =0;i<words.length;i++){
            words[i]=words[i].toLowerCase();
        }
        Set <String> list = new HashSet<>(Arrays.asList(words));
        String[] words1= list.toArray(new String[0]);
        int[] counter = new int[list.size()];
        for (int i=0;i<words1.length;i++){
            for (int j = 0;j<words.length;j++){
                if (words1[i].equals(words[j])){
                    counter[i]++;
                }
            }
        }
        HashMap <String,Integer> dictionary = new HashMap<>();
        for (int i =0;i<list.size();i++){
            dictionary.put(words1[i],counter[i]);
        }
        dictionary.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

}
