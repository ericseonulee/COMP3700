// public enum itemStatus {
//     AVAILABLE(0),
//     CHECKEDOUT(1),
//     RESERVED(2);

//     Integer status;

//     itemStatus (Integer status) {
//         this.status = status;
//     }
// }

interface CategoryItem {
    String title = "Item not found";
    String type = "None";
    int itemStatus = 0;

    public String getTitle();

    public String getType();

    public int getItemStatus();

    public boolean setItemStatus(int state);
}

