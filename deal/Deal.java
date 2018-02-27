package deal;

/**
 * Created by Василий on 22.02.2018.
 */
public class Deal {
    //
    private User[] user_deal;
    private Product[] products;
    private Integer[] product_count;

    public void setUser_deal(User[] user_deal) {
        this.user_deal = user_deal;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setProduct_count(Integer[] product_count) {
        this.product_count = product_count;
    }

    public User[] getUser_deal() {
        return user_deal;
    }

    public Product[] getProducts() {
        return products;
    }

    public Integer[] getProduct_count() {
        return product_count;
    }


    private static void prise() {
    }

    ;
}
