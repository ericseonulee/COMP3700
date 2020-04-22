import java.util.ArrayList;

public class Catalog {
    ArrayList<Item> items = new ArrayList<>();

    public Catalog() {
        addTest();
    }

    public boolean addTest() {
        try {
            Item item1 = new Item("Test Book", "Book");
            Item item2 = new Item("Test Movie", "Movie");
            Item item3 = new Item("Test Device", "Device");

            this.items.add(item1);
            this.items.add(item2);
            this.items.add(item3);

            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    public Item findItem (String title) {
        Item query = new Item("Item Not Found", "None");
        if (title == null || title.isEmpty()) ;
        else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getTitle().equals(title)) {
                    query = items.get(i);
                }
            }
        }
        return query;
    }
}