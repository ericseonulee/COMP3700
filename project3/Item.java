public class Item implements CategoryItem{
    String title = "Item not found";
    String type = "None";
    int itemStatus = 0;
    public Item() {
       this.itemStatus = 0;
    }
    
    public Item(String title, String type) {
       this.title = title;
       this.type = type;
       this.itemStatus = 0;
    }
    
    public String getTitle() {
       return title;
    }
    
    public String getType() {
       return type;
    }
    
    public int getItemStatus() {
       return itemStatus;
    }
    public boolean setItemStatus(int state) {
        this.itemStatus = state;
        return true;
    }
}