import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class ArraysList {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = "Milk";

        ArrayList objectList = new ArrayList(); //Raw use i.e., without specifying the type

        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(Arrays.deepToString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Orange"));
        groceryList.add(new GroceryItem("Butter"));

        //groceryList.add(0, new GroceryItem("Bread"));
        //groceryList.remove(1);    //removes the item of index given
        groceryList.set(0, new GroceryItem("Bread"));

        System.out.println(groceryList);


    }
}
