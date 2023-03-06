package top.hang.ioc.entity;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 16:30
 */
public class Pen {
    private String name;

    public Pen(String name) {
        this.name = name;
    }

    public Pen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                '}';
    }
}
