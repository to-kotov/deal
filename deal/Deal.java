package deal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Василий on 22.02.2018.
 */
public class Deal {
    //
    private User seller, buyer;
    private Map<Integer,Product> products;

    public Deal(User seller, User buyer, Map<Integer,Product> products) {
        super();
        this.seller = seller;
        this.buyer = buyer;
        //this.products = new Product[2];
        this.products = products;
    }

    public Map<Integer,Product> getProducts() {
        return products;
    }

    public Product getProduct(Integer i) {
        return products.get(i);
    }


    public User get_seller() {
        return seller;
    }

    public User get_buyer() {
        return buyer;
    }


    public void view_deal() {
        System.out.println("___________________________________________________________________");
        System.out.println("Детали Сделки");
        System.out.println("Продавец:" + get_seller().getName());
        System.out.println("Покупатель:" + get_buyer().getName());
        /*
        for (int i = 0; i < 2; i++) {
          Product p = getProduct(i);
        System.out.println(p.getId());
        }
        */
        //for(Product p: products){
        //   System.out.println(p.getId());
        //}

        products.forEach((i, p) -> {
            System.out.println("Продукт: "+p.getName()+";");
            System.out.println("Стоимость:" + p.getCost() + "*" + p.getCount() + "=" + p.getItog());
        }
        //Итого по сделке
        );
        System.out.println("___________________________________________________________________");
    }


    private static void prise() {
    }

    ;
}
