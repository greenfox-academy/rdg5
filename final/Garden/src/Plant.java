
public class Plant {

    int waterAmount;
    String color;
    double absorbRatio;

    public String waterStatus() {
        if (waterAmount < 5) {
            return "The " + this.color + " flower needs water!";
        }
        return "The " + this.color + " needs no more water!";
    }

    public boolean waterNeed() {
        return (waterAmount < 5);
    }

}