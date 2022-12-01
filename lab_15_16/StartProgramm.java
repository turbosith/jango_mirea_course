package laby.lab_15_16;


import java.util.HashMap;
import java.util.LinkedList;

public class StartProgramm {
    public static void main(String[] args) {
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addMenu(new Dish(1000, "Карпачо", "Блюдо из тонко нарезанных кусочков сырой говяжьей вырезки"));
        internetOrder.addMenu(new Drink(60, "Кола, Добрый кола"));
        InternetOrder.addMenu(new Drink(800, "Пуэр 10-ти летней выдержки"));


        LinkedList<Item> items = internetOrder.getSorted();
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }

        OrderManager orderManager1 = new OrderManager();
        orderManager1.addMenu(new Drink(500, "Швепс"), "проспект Вернадского");
        orderManager1.addMenu(new Drink(200, "Мохито"), "Римская");
        orderManager1.addMenu(new Drink(650, "Вино"), "Северная улица");

        HashMap<String, Item> listAddress = orderManager1.getListAddress();
        for(String key : listAddress.keySet()){
            System.out.println(listAddress.get(key).getOpis()+ " - " + listAddress.get(key).getPrice() + ", адрес: " + key);
        }

        new GUIR().setVisible(true);
    }
}