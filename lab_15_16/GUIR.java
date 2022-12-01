package laby.lab_15_16;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class GUIR extends JFrame {
    String address = "";
    private final Font defaultFont = new Font("Roboto", Font.PLAIN, 14);
    private final BorderLayout layout = new BorderLayout();
    private final JPanel centerPanel = new JPanel();
    JTextField jta = new JTextField(10);

    JLabel kol = new JLabel("Позиций в заказе: ");

    JButton buttonOffline = new JButton("Заказать столик");
    JButton buttonOnline = new JButton("Заказать еду на дом");

    JButton dish1 = new JButton("Карпаччо");
    JButton drink = new JButton("Кола");

    JButton dish2 = new JButton("Суши");
    JButton drink2= new JButton("Швепс");
    JButton end = new JButton("Закончить выбор");

    Font fnt = new Font("Times new roman", Font.BOLD, 25);

    private void chooseTable(){
        JButton choose = new JButton("Выбрать");
        add(jta);
        add(choose);
        validate();
        choose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    int x2 = Integer.parseInt(jta.getText().trim());
                    getContentPane().removeAll();
                    getContentPane().repaint();

                    add(new JLabel("Ваш выбор был записан. Что вы желаете заказать?"));
                    add(dish1); add(drink); add(end);
                    add(kol);
                    validate();
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Некорректный ввод!", "Warning!", JOptionPane.INFORMATION_MESSAGE);
                    jta.setText("");
                }

            }
        });
    }

    private void chooseAddress(){
        JButton choose = new JButton("Выбрать");
        add(jta);
        add(choose);
        validate();
        choose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                address = jta.getText().trim();
                getContentPane().removeAll();
                getContentPane().repaint();

                add(new JLabel("Ваш выбор был записан. Что вы желаете заказать?"));
                add(drink2); add(dish2); add(end);
                add(kol);
                validate();
            }
        });
    }

    private void chooseInternet(){
        OrderManager orderManager = new OrderManager();

        dish2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderManager.addMenu(new Dish(5990, "Суши", "Сет калифорния фиаладельфия"), address + (orderManager.getKol()+1));
                kol.setText("Кол-во позиций в заказе: " + orderManager.getKol());
                //dish2.setEnabled(true);
            }
        });

        drink2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderManager.addMenu(new Drink(500, "Швепс"), address+ (orderManager.getKol()+1));
                kol.setText("Кол-во позиций в заказе: " + orderManager.getKol());
            }
        });

        end.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                getContentPane().repaint();
                add(kol);
                kol.setText("Кол-во позиций в заказе: " + orderManager.getKol());
                add(new JLabel("Сумма вашего заказа - " + orderManager.getPrice()));
                add(new JLabel("Адрес доставки: " + address));
                validate();
            }
        });

    }

    private void chooseDish(){
        InternetOrder internetOrder = new InternetOrder();
        dish1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internetOrder.addMenu(new Dish(1000, "Карпачо", "Блюдо из тонко нарезанных кусочков сырой говяжьей вырезки"));
                kol.setText("Кол-во позиций в заказе: " + internetOrder.getKol());
            }
        });

        drink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internetOrder.addMenu(new Drink(60, "Кола, Добрый кола"));
                kol.setText("Кол-во позиций в заказе: " + internetOrder.getKol());
            }
        });

        end.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                getContentPane().repaint();
                add(kol);
                kol.setText("Кол-во позиций в заказе: " + internetOrder.getKol());
                add(new JLabel("Сумма вашего заказа - " + internetOrder.getPrice()));
                validate();
            }
        });
    }

    public GUIR() {
        super("Бар Драйв");
        setLayout(new FlowLayout());
        this.getContentPane().add(this.centerPanel, BorderLayout.CENTER);
        setSize(350, 200);
        add(new JLabel("Выберите вариант предоставления услуг"));
        add(buttonOffline);
        add(buttonOnline);

        buttonOffline.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                getContentPane().removeAll();
                getContentPane().repaint();
                add(new JLabel("Введите номер столика"));
                validate();
                chooseTable();
                chooseDish();
            }
        });

        buttonOnline.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                getContentPane().removeAll();
                getContentPane().repaint();
                add(new JLabel("Введите адрес, по которому будет производиться доставка"));
                validate();
                chooseAddress();
                chooseInternet();
            }
        });
    }

}
