package top.hang.ioc.entity;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 16:19
 */
public class Person {
//    属性： 姓名（name），服装（clothes）
    private String name;
    private Clothes clothes;

    public Person() {
    }

    public Person(String name, Clothes clothes) {
        this.name = name;
        this.clothes = clothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", clothes=" + clothes +
                '}';
    }
//    dress()方法，用来描述穿着。
//    public void dress(){
//        System.out.println(name+"穿着"+clothes);
//    }
}
