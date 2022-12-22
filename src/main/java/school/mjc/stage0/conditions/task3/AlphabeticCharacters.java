package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character >= 65 && character <= 90 || character >= 97 && character <= 122)
        {
            if (character == 'A' || character == 'E' || character == 'O'
            || character == 'I' || character == 'U' || character == 'a' || character == 'e'
            ||character == 'o' || character == 'i' || character == 'u')
            {
                System.out.println("Vowel");
            }
            else
            {
                System.out.println("Consonant");
            }
        }
        else
        {
            System.out.println("wrong alphabet!");
        }
    }
}
