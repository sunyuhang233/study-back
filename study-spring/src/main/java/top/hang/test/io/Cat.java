package top.hang.test.io;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 12:35
 */
public class Cat {
    private Integer age;
    private Animal animal;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Cat(Integer age, Animal animal) {
        this.age = age;
        this.animal = animal;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", animal=" + animal +
                '}';
    }
}
