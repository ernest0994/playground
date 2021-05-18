package builder;

import java.util.ArrayList;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.stream().forEach(System.out::println);

        lista.stream()
                .filter(e -> e > 10)
                .forEach(e -> System.out.println(e));
    }

}
