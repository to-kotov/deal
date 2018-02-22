package deal;

/**
 * Created by Василий on 16.02.2018.
 */
public class Product {

    private String name;
    private Integer cost;
    private Integer id;
    private Integer count;

    public String getName() {
        return name;
    }
    public Integer getCost() {
        return cost;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setcount(int cost) {
        this.count = count;
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
