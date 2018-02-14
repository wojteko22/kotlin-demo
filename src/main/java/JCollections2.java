import java.util.stream.Stream;

public class JCollections2 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3)
                .map(it -> {
                    System.out.println(it);
                    return it * 2;
                });

        System.out.println("first: " + stream.findFirst());
        System.out.println("first: " + stream.findFirst());
    }
}
