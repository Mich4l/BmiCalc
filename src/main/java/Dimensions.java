public class Dimensions {

    double height;
    double weight;

    public Dimensions(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "wzroście " + height +
                "m i wadze " + weight + "kg wynosi: " + (int)bmi();
    }
    public double bmi(){
        return weight /(height * height);
    }
}
