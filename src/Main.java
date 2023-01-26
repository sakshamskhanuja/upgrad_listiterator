import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Float> random = new ArrayList<>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        printList(random);
    }

    public static void printList(List<Float> arr) {
        ListIterator<Float> iterator = arr.listIterator(arr.size());
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}