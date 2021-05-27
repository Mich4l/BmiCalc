public class User {

    private String name;
    private int age;
    private Dimensions dimensions;

    public User(String name, int age, Dimensions dimensions) {
        this.name = name;
        this.age = age;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return name +" twoje BMI w wieku " + age +
                " przy" + dimensions;
    }
}

