public class store {
    //Properties
    private String name;
    private boolean open;
    private String itemsForSale;

    //Constructor
    public store(String name, boolean open, String location) {
        this.name = name;
        this.open = open;
        this.itemsForSale = itemsForSale;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getItemsForSale() {
        return itemsForSale;
    }

    public void setItemsForSale(String itemsForSale) {
        this.itemsForSale = itemsForSale;
    }
    //Methods
    public void storeOpen(){
        if (open == true){
            System.out.println("This store is open");
        } else {
            System.out.println("This store is closed");
        }
    }
    //ToString
    @Override
    public String toString() {
        return name+ "\n" +
                open + "\n"+
                "This store has items like "+ itemsForSale;
    }
}
