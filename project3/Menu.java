import java.util.Scanner;

public class Menu {
   LibrarySystem system;
   Catalog catalog = new Catalog();
   String menuUI = "Please make a selection\n[1] Reserve a book\n[x] Logout";
   public Menu() {
      this.system = new LibrarySystem();
   }

   public boolean selectOption() {
      Scanner scan = new Scanner(System.in);
   
      System.out.println(menuUI);
   
      String choice = scan.nextLine();
      if (choice.equals("x")) {
         System.out.println("Logging out");
         return true;
      }
      System.out.println("Item to search:");
      String itemTitle = scan.nextLine();
      Item itemFound = catalog.findItem(itemTitle);
      if (itemFound.getTitle().equals("Item Not Found")) 
         return false;
      
      if (choice.equals("1")) {
         system.reserve(itemFound);
         return false;
      }
      else {
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
