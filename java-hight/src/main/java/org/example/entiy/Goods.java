package org.example.entiy;

import java.util.Objects;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:24
 */
public class Goods {
    private String sn;
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods goods)) return false;
        return Objects.equals(sn, goods.sn) && Objects.equals(title, goods.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sn, title);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "sn='" + sn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public Goods(String sn, String title) {
        this.sn = sn;
        this.title = title;
    }

    public Goods() {
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
