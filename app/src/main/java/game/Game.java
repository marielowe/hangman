package game;
import java.util.ArrayList;

public class Game {

public ArrayList<Character> guessedLetters = new ArrayList<>();
private Integer counter = 10;
private String randomWord;  //this is a class property

  public Game(WordChooser chooser) {
   //this is like @chooser = chooser. this is the constructor line 5-7
    this.randomWord = chooser.getRandomWordFromDictionary();
      //this is like @chooser = chooser.
    }
    public ArrayList<Character> getAll() {
      return guessedLetters;
  }

  public String getWordToGuess(){
    StringBuilder builder = new StringBuilder();
    for (int i = 0; 0 < this.randomWord.length(); i++) {
      Character currentLetter = randomWord.charAt(0); 
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
  public Boolean guessLetter(Character letter){
if(this.randomWord.indexOf(letter) == -1){
  counter--;
  return false;
} else{
  guessedLetters.add(letter);
  return true;
} 
  }
}

  // makers
  // 0,1,2,3,4,5
  // m is current currentLetter
  // if we are on m show me the m
  // if we arent on m keep doing ______