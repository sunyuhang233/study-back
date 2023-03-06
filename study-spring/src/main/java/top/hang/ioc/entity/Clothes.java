package top.hang.ioc.entity;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 16:17
 */
public class Clothes {
//    style color
    private String style;
    private String color;

    public Clothes() {
    }

    public Clothes(String style, String color) {
        this.style = style;
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "style='" + style + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
