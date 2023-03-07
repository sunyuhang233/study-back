package top.hang.test.io;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 12:39
 */
public class Dog {
    List<Animal> animals;
    private  Integer age;

    public Dog(List<Animal> animals, Integer age) {
        this.animals = animals;
        this.age = age;
    }

    public Dog() {
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "animals=" + animals +
                ", age=" + age +
                '}';
    }
}
