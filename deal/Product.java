package deal;

/**
 * Created by Василий on 16.02.2018.
 */
public class Product {

    private String name;
    private int cost;
    private int id;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setCost(String email) {
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product() {
    }

    public Product(String name, int cost, int id) {
        super();
        this.name = name;
        this.cost = cost;
        this.id = id;
    }


}
