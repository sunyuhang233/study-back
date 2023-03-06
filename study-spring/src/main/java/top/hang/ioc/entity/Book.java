package top.hang.ioc.entity;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 15:51
 */
public class Book {
//    1、 创建Book类，类结构如下：
//a) 属性：图书编号，图书名称，图书价格；
//b) 无参以及带参构造方法，并在构造方法中输出Book对象，Book对象通过无参（带参）构造方法创建；
//c) get和set方法
    private int id;
    private String name;
    private double price;

    public Book() {
        System.out.println("Book对象通过无参构造方法创建");
    }

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        System.out.println("Book对象通过带参构造方法创建");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
