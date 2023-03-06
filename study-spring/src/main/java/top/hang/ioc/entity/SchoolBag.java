package top.hang.ioc.entity;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 16:29
 */
public class SchoolBag {
    private String color;
    private List<Pen> pencilCase;

    public SchoolBag(String color, List<Pen> pencilCase) {
        this.color = color;
        this.pencilCase = pencilCase;
    }

    public SchoolBag() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Pen> getPencilCase() {
        return pencilCase;
    }

    public void setPencilCase(List<Pen> pencilCase) {
        this.pencilCase = pencilCase;
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "color='" + color + '\'' +
                ", pencilCase=" + pencilCase +
                '}';
    }
}
