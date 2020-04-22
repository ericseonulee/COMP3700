import java.util.Scanner;

public class Menu {
    LibrarySystem system;
    Catalog catalog = new Catalog();
    String menuUI = "Please make a selection\n[1] Check out a book\n[2] Reserve a book\n[x] Logout";
    public Menu() {
        this.system = new LibrarySystem();
    }

    public boolean selectOption() {
        Scanner scan = new Scanner(System.in);

        System.out.println(menuUI);

        String choice = scan.nextLine();
        String itemTitle = scan.nextLine();
        Item itemFound = catalog.findItem(itemTitle);
        scan.close();
        if (itemFound.getTitle().equals("Item Not Found")) return false;
        
        switch (choice) {
            case "1":
                System.out.println("Item to search:"); 
                system.checkOut(itemFound);
                return true;
            case "2":
                System.out.println("Item to search:");
                system.reserve(itemFound);
                return true;
            case "x":
                System.out.println("Logging out");
                return false;
            default:
                System.out.println("Unrecognized input. Please try again.");
                return false;
        }
    }

    public boolean openCatalog(Catalog catalog) {
        if (catalog != null) {
            this.catalog = catalog;
            return true;
        }
        return false;
    }
}
