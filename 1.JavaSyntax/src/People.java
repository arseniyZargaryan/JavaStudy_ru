public class People {
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
