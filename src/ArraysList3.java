import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysList3 {
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

//        groceries.remove("Banana");
//        System.out.println(groceries);

        groceries.removeAll(List.of("Banana, Apples"));
        System.out.println(groceries);

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
