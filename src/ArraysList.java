import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String source, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
}

public class ArraysList {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = "Milk";

        ArrayList objectList = new ArrayList();

        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(Arrays.deepToString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Orange"));
        groceryList.add(new GroceryItem("Butter"));

    }
}
