import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"Apples", "Banana", "Mango", "Cucumber"};
        //System.out.println(Arrays.toString(items));

        List<String> list = List.of(items); //List is Immutable
        System.out.println(list);

        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list); //ArrayList is Mutable
        groceries.add("Orange");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(              //another way of instantiating ArrayList
                List.of("Banana", "Apple", "Milk", "Bread")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
