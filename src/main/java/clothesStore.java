import java.util.HashMap;
import java.util.Map;

public class clothesStore extends store{
    private Map<String, Double> inventory = new HashMap<>();

    public clothesStore(String name, boolean open, String location, Map<String, Double> inventory) {
        super(name, open, location);
        this.inventory = inventory;
    }

    public Map<String, Double> getInventory() {
        return inventory;
    }

    public void setInventory(Map<String, Double> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "clothesStore{" +
                "inventory=" + inventory +
                '}';
    }
}
