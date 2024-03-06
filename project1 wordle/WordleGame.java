package projects.wordle;

public class WordleGame {
    public static void main(String[] args) {
        Wordle wordle = new makeWordle("example", 6);
        wordle.play();
    }
}
