import java.util.HashMap;
import java.util.Map;

public class musicStore extends store{

    private Map<String, Double> inventory = new HashMap<>();

    public musicStore(String name, boolean open, String location, Map<String, Double> inventory) {
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
        return "musicStore{" +
                "inventory=" + inventory +
                '}';
    }
}
