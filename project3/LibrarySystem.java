
public class LibrarySystem {
    public LibrarySystem() {
        
    }

    public Menu openMenu() {
        return new Menu();
    }

    public void reserve(Item item) {
        if (item.getItemStatus() == 0) {
            item.setItemStatus(1);
            System.out.println("Item reserved. Returning to menu");
        }
    }
}
