package projects.hangman;

public class HangmanGame {
    public static void main(String[] args) {
        Hangman hangman = new makeHangman("example", 8);
        hangman.play();
    }
}