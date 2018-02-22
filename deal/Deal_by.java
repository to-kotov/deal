package deal;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sbt-kotov-vyu on 15.02.2018.
 */

public class Deal_by {

    private static final int USER_COUNT = 3;
    private static final int PRODUCT_COUNT = 3;
    private static int inner_user = 0;
    private static int inner_product = 0;
    private static User[] users = new User[USER_COUNT];
    private static Product[] products = new Product[PRODUCT_COUNT];
    private static boolean flag1 = true;//false; для создания заглушки тестовых данных
    private static boolean flag2 = true;//false;






    public static void main(String[] args) {
        while (true) {
            new Deal_by().dealAction();//выбор действия
        }
    }

    private static void dealAction() {
        String chois;
        users[0]=new User("name_1","email_1",1,"user_role_one");
        users[1]=new User("name_2","email_2",2,"user_role_two");
        users[2]=new User("name_3","email_3",3,"user_role_two");

        products[0]=new Product("name_product_1",100,1);
        products[1]=new Product("name_product_2",200,2);
        products[2]=new Product("name_product_3",300,3);

        //тестовый набор пользователей

        System.out.println("Vvod user:");


        System.out.println("Введите номер необходимого дейсвия:");
        System.out.println("1) Ввод пользователя.");
        System.out.println("2) Ввод товара.");
        System.out.println("3) Создание сделки.");
        System.out.println("4) Просмотр деталей сделки");
        System.out.println("5) EXIT");


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
                //Выбор продовца
                deal_by();
                //Выбор покупателя
                //Выбор товара
                //Показ деталей сделки


                break;
            }
            case ("4"): {
                System.out.println("Вырали 4 " + chois);
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
        //перевод с массива на мапу
/*
        Map<Product, Integer> products= new HashMap<Product, Integer>();
        Set<Map.Entry<Product, Integer>> entries = products.entrySet();
        for(Map.Entry<Product, Integer> entry: entries){
            System.out.println(entry.getKey().getName());
            System.out.println(entry.getValue());
        }
*/

    }


    private static void in_user() {
        if (inner_user < 3) {
            String name = inputText("Name");
            String email = inputText("email");
            int id = Integer.valueOf(inputText("id"));
            String user_role = inputText("user_role");
            users[inner_user] = new User(name, email, id, user_role);
            inner_user++;
            flag1 = true;
        } else {
            System.out.println("Vvedeno maksimalnoe kol-vo polzovateley");
        }
    }

    private static void in_product() {
        if (inner_product < 3) {
            String name = inputText("Name");
            int cost = Integer.valueOf(inputText("cost"));
            int id = Integer.valueOf(inputText("id"));
            products[inner_product] = new Product(name, cost, id);
            inner_product++;
            flag2 = true;
        } else {
            System.out.println("Vvedeno maksimalnoe kol-vo polzovateley");
        }
    }

    private static void deal_by() {

        String chois_seller;
        String chois_byer;

        if (flag1 && flag2) {

            System.out.println("Выберите продавца");
            out_user("user_role_one");
            chois_seller = inputText("Вводим тут ");
            System.out.println("Выберете покупателя");
            out_user("user_role_two");
            chois_byer = inputText("Вводим тут ");
            System.out.println("Выберете товар или завершите сделку");
            chois_product();
            System.out.println("Подтвердите офёрту");
        } else {
            System.out.println("Не хватает пользователей с ролями");
        }
    }

    private static Product[] chois_product() {
        Integer[] product_id = new Integer[2];
        Integer[] product_count = new Integer[2];
        Product[] products = new Product[2];
        //считать ввод
        for (int i = 0; i < 2; i++) {
            out_product();
            products[i] = getProduct_on_id(Integer.parseInt(inputText("Вводим тут id " + (i + 1) + "товара:")));
            products[i].setcount(Integer.parseInt(inputText("Вводим тут количество товара:")));
        }
        return products;

        //проверить на наличие такого товара


    }

    private static Product getProduct_on_id(int i) {
        Product prr = new Product();
        for (Product pr : products) {
            if (pr.getId().equals(i)) {
                prr = pr;
            }
        }
        return prr;
    }

    private static void out_product() {
        for (int i = 0; i < products.length; i++)
            System.out.println(products[i].getName() + " " + "id:" + products[i].getId());
    }

    private static void out_user(String s) {
        for (int i = 0; i < users.length; i++)
            if (users[i].getUser_role().equals(s)) {
                System.out.println(users[i].getName() + " " + "id:" + users[i].getId());
            }
    }


    private static String inputText(String message) {
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