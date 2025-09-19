import java.util.Arrays;
import java.util.List;

public class lamdaFunctions {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList(
                "Java 8", "C++", "Python", "JavaScript", "Java EE", "C#"
        );

        System.out.println("Processing the list of languages:");

        languages.stream()
                .filter(s -> s.contains("Java"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}