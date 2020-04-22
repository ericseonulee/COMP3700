
public class LibrarySystem {
    public LibrarySystem() {
        
    }

    public Menu openMenu() {
        return new Menu();
    }

    public void checkOut(Item item) {
        if (item.getItemStatus() == 0) {
           item.setItemStatus(1);
           System.out.println("Item checked out. Returning to menu");
        }
        
        else System.out.println("Item not available for checkout. Returning to menu");
    }

    public void reserve(Item item) {
        if (item.getItemStatus() == 0) {
            item.setItemStatus(2);
        }
        else System.out.println("Item reserved. Returning to menu");

    }
}
