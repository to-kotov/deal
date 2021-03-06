package deal;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



/**
 * Created by sbt-kotov-vyu on 15.02.2018.
 */

public class Deal_by {

    private static Map<Integer, User> users = new HashMap();
    private static Map<Integer, Product> products = new HashMap<Integer, Product>();
    private static Map<Integer, Deal> deals = new HashMap<Integer, Deal>();
    private static boolean flag1 = true;//false; для создания заглушки тестовых данных
    private static boolean flag2 = true;//false;
    private static boolean flag_u;// = true;
    private static int deal_now = 0;
    private static String seller_role = "user_role_one";
    private static String buyer_role = "user_role_two";


    public static void main(String[] args) {
        while (true) {
            new Deal_by().dealAction();//выбор действия
        }
    }

    private static void dealAction() {

        users.put(1, new User("name_1", "email_1", 1, "user_role_one"));
        users.put(2, new User("name_2", "email_2", 2, "user_role_two"));
        users.put(3, new User("name_3", "email_3", 3, "user_role_two"));

        products.put(1, new Product("name_product_1", 100, 1));
        products.get(1).setcount(1);
        products.put(2, new Product("name_product_2", 200, 2));
        products.get(2).setcount(2);
        products.put(3, new Product("name_product_3", 300, 3));
        products.get(3).setcount(3);

        if (deal_now == 0) {
            deals.put(deal_now, new Deal(users.get(1), users.get(2), products));
            deal_now++;
        }

        System.out.println("Введите номер необходимого дейсвия:");
        System.out.println("1) Ввод пользователя.");
        System.out.println("2) Ввод товара.");
        System.out.println("3) Создание сделки.");
        System.out.println("4) Просмотр деталей сделки");
        System.out.println("5) EXIT");

        String chois;
        chois = inputText("Вводим тут  ");
        System.out.println(chois);

        switch (chois) {
            case ("1"): {
                System.out.println("Выбрали :" + chois);
                in_user();
                break;
            }
            case ("2"): {
                System.out.println("Выбрали :" + chois);
                in_product();
                break;
            }
            case ("3"): {
                System.out.println("Выбрали 3" + chois);
                deal_by();
                //Показ деталей сделки
                break;
            }
            case ("4"): {
                System.out.println("Вырали 4 " + chois);
                deals.forEach((i, p) -> p.view_deal());
                break;
            }
            case ("5"): {
                System.out.println("Вырали 5" + chois);
                break;
            }
            default: {
                System.out.println("Дубль два");
            }
        }
    }


    private static void in_user() {
        String name = inputText("Name");
        String email = inputText("email");
        int id = Integer.valueOf(inputText("id"));
        String user_role = inputText("user_role");
        users.put(users.size()+1, new User(name, email, id, user_role));
        flag1 = true;
    }


    private static String chois_dealers(String s) {
        flag_u = true;
        String chois_seller = new String();
        out_user(s);
        while (flag_u) {
            chois_seller = inputText("Вводим тут ");
            //users.forEach((i, p) ->
            Iterator<User> it = users.values().iterator();
            while(it.hasNext())
            {
                User p = it.next();
                if (p.getId().equals(Integer.parseInt(chois_seller)) && p.getUser_role().equals(s)) {
                    flag_u = false;
                }
            };
            if (flag_u) {
                System.out.println("Ведите id нового пользователя");
                out_user(s);
                chois_seller = inputText("Вводим тут ");
            }
        }
        return chois_seller;
    }


    private static void in_product() {
            String name = inputText("Name");
            int cost = Integer.valueOf(inputText("cost"));
            int id = Integer.valueOf(inputText("id"));
            products.put(products.size()+1, new Product(name, cost, id));
            flag2 = true;

    }

    private static void deal_by() {
        String chois_seller = new String();
        String chois_byer = new String();
        Map<Integer, Product> products = new HashMap<Integer, Product>();

        if (flag1 && flag2) {

            System.out.println("Выберите id продавца");
            chois_seller = chois_dealers(seller_role);

            System.out.println("Выберете id покупателя");
            chois_byer = chois_dealers(buyer_role);

            System.out.println("Выберете товар или завершите сделку");
            products = chois_product();


            deals.put(deal_now, new Deal(chois_user_by_id(Integer.parseInt(chois_seller)), chois_user_by_id(Integer.parseInt(chois_byer)), products));
            deal_now++;
            deals.get(deal_now - 1).view_deal();

            System.out.println("Подтвердите офёрту");
        } else {
            System.out.println("Не хватает пользователей с ролями");
        }
    }

    private static User chois_user_by_id(Integer id) {
        User r_us = new User();
        for (Integer i = 1; i <= users.size(); i++) {
            if (users.get(i).getId() == id) {
                r_us = users.get(i);
            }
        }

        return r_us;
    }

    private static HashMap<Integer, Product> chois_product() {
        HashMap<Integer, Product> products1 = new HashMap<Integer, Product>();
        //считать ввод
        for (Integer i = 0; i < 2; i++) {
            out_product();
            products1.put(i, getProduct_on_id(Integer.parseInt(inputText("Вводим тут id " + (i + 1) + "товара"))));
            products1.get(i).setcount(Integer.parseInt(inputText("Вводим тут количество товара")));
        }
        return products1;
        //проверить на наличие такого товара
    }


    private static Product getProduct_on_id(int i) {
        Product prr, pr;
        prr = new Product();

        Iterator<Product> it = products.values().iterator();
        //products.forEach((k,pr)->
        while (it.hasNext()) {
            pr = it.next();
            if (pr.getId().equals(i)) {
                prr = pr;
            }
        }
        ;
        return prr;
    }

    private static void out_product() {
        //for (int i = 0; i < products.size(); i++)
        products.forEach((i, p) ->
                System.out.println(p.getName() + " " + "id:" + p.getId()));
    }

    private static void out_user(String s) {
        users.forEach((i, u) -> {
            if (u.getUser_role().equals(s)) {
                System.out.println(u.getName() + " " + "id:" + users.get(i).getId());
            }
        });
    }


    public static String inputText(String message) {
        //Ввод с клавиатуры
        System.out.print(message + ":");
        try {
            // создание буферезированного ридера
            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(System.in));
            //создание буффера ввода стандартного потока ввода, зависит от стандартной процедуры чтения строки.
            //дальше производим чтение таким оброзом String s = reader.readLine();
            String st = reader.readLine();
            return st;
        } catch (Exception e) {
            System.out.print("упали еще раз");
        }
        Scanner scan = new Scanner(System.in);
        String rez = scan.next();
        scan.close();
        return rez;
    }

}