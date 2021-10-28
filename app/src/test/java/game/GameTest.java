package game;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GameTest {
  @Test 
  public void testGetsWordToGuess() {
    WordChooser mockedClass = mock(WordChooser.class); //mocking the class
    when(mockedClass.getRandomWordFromDictionary()).thenReturn("BOB"); //stubbing the value
    Game game = new Game(mockedClass);
    assertEquals(game.getWordToGuess(), "B__");
  }
  @Test 
  public void testGetRemainingAttempts(){
    Game game = new Game(new WordChooser());
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10) );
  }
  @Test public void testGuessCorrectLetter() {
    WordChooser mockedClass = mock(WordChooser.class);
    when(mockedClass.getRandomWordFromDictionary()).thenReturn("JIM");
    Game game = new Game(mockedClass);
    assertEquals(game.guessLetter('I'), true );
  }
  @Test public void testGuessIncorrectLetter() {
    WordChooser mockedClass = mock(WordChooser.class);
    when(mockedClass.getRandomWordFromDictionary()).thenReturn("JIM");
    Game game = new Game(mockedClass);
    assertEquals(game.guessLetter('O'), false );
    ArrayList<Character> guessedLetters = game.getAll();
    assertTrue(guessedLetters.isEmpty());
    /* instead of line 34can also 
    do assertTrue(game.getAll().isEmpty());
    */
}
}