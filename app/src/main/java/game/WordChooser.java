package game;

import java.util.Random;

public class WordChooser {
  static final String[] DICTIONARY={"MAKERS", "CANDIES", "JIM", "LONDON"};

  public String getRandomWordFromDictionary(){
    Random randomWord = new Random();
    return DICTIONARY[randomWord.nextInt(DICTIONARY.length)];
  }
}
