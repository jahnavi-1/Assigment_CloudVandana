import java.util.*;

public class java_shuffle_array {
    public static void main(String[] args) {
        // Create a List with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        List.add(7);

        // Shuffle the List using Collections.shuffle
        Collections.shuffle(List);

        // Convert the List back to an array if needed
        Integer[] shuffledArray = List.toArray(new Integer[List.size()]);

        // Print the shuffled array
        for (int i : shuffledArray) {
            System.out.print(i + " ");
        }
    }
}
