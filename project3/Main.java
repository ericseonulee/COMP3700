public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library");

        Menu menu = new Menu();
        Catalog catalog = new Catalog();
        menu.openCatalog(catalog);
        boolean logout = false;
        while (!logout) {
            logout = menu.selectOption();
        }
    }
}