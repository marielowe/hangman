package game;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WordChooserTest {

  @Test public void testGetRandomWordFromDictionary(){
    WordChooser word = new WordChooser();
    assertEquals(word.getRandomWordFromDictionary(),"MAKERS");
  }
}
