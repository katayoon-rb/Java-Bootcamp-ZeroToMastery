package functionalprogramming.exercises;
import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "functional", "programming");
        strings.forEach(System.out::println);
    }
}

