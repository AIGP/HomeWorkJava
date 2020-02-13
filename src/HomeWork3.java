import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        guessWord();
    }

    public static void guessWord(){
        String[] words = new String[] {"apple", "orange", "lemon", "banana", "apricot",
                                       "avocado", "broccoli", "carrot", "cherry",
                                       "garlic", "grape", "melon", "leak", "kiwi", "mango",
                                       "mushroom", "nut", "olive", "pea", "peanut", "pear",
                                       "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        System.out.println(words[random.nextInt(words.length)]);
    }
}
