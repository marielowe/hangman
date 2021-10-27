package game;

import java.util.Random;

public class Game {
private String word; //this is a class property
private Integer counter = 10; 
static final String[] DICTIONARY={"MAKERS", "CANDIES", "JIM", "LONDON"};

  public Game(String word) {
    this.word = word; //this is like @word = word. this is the constructor line 5-7
  }
  public String getWordToGuess(){
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < this.word.length(); i++) {
      Character currentLetter = word.charAt(0);
      if (i == 0) {
          builder.append(currentLetter);
      } else {
          builder.append("_");
      }
  }
  return builder.toString();
  }
  public Integer getRemainingAttempts(){
return this.counter;
  }  
  public String getRandomWordFromDictionary(){
    Random randomWord = new Random();
    return DICTIONARY[randomWord.nextInt(DICTIONARY.length)];
  }
}

  // makers
  // 0,1,2,3,4,5
  // m is current currentLetter
  // if we are on m show me the m
  // if we arent on m keep doing ______