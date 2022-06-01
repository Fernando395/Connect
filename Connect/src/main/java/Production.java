public class Production {

    private double goal;
    private double partial;

    public Production(double partial) {
        this.goal = 1.200;
        this.partial = partial;
    }

    public void details() {
        double result = goal - partial;
        System.out.println("Falta " + result + " Para Você bater a meta do mes");
        System.out.println("Sua produção atual é " + partial);
    }

    public void increases(double increment) {
        this.partial = getPartial() + increment;
    }

    public void decrease(double decrement) {
        this.partial = getPartial() - decrement;
    }

    public double getGoal() {
        return goal;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public double getPartial() {
        return partial;
    }

    public void setPartial(double partial) {
        this.partial = partial;
    }
}
