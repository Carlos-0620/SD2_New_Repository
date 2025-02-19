package griffith;

public class Word {
    private char[] letters;

    public Word(char[] letters) {
        this.letters = letters != null ? letters : new char[0]; // Ensure letters is not null
    }

    public boolean contains(char symbol) {
        for (char letter : letters) {
            if (letter == symbol) {
                return true;
            }
        }
        return false;
    }

    public int length() {
        return letters.length;
    }

     public char[] getLetters() {
        return letters;
    }
}
