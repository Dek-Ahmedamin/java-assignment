public class CalculateG {
    static void multi() {
        double gravity = -9.81;
        double fallingtime = 30;
        //finalveocity = gravity * fallingtime
        double initialvelocity = 0.0;
        double finalvelocity = gravity * fallingtime;
        //finalposition = initialPosition + 0.5 * gravity * time * time
        double initialposition = 0.0;
        double finalposition = initialposition + 0.5 * gravity * fallingtime * fallingtime;
        System.out.println("The object's position after " + fallingtime + " seconds is "
                + finalposition + " m.");
    }
    public static void main(String[] args) {
        multi();
    }
}