package com.example.kodillacollectionsadvanced.exercises.dictionary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DictionaryTestSuite {
@Test
    public void testAddWord(){
    Dictionary dictionary = new Dictionary();
    String polishWord = "stos";
    EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN "stuck");
    dictionary.addWord((polishWord, englishWord));
    assertEquals(1, dictionary.size());
}
}