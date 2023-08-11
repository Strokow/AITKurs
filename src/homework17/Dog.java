package homework17;

public class Dog {
    //task1
    private String name;
    private double jumpHeight;

    public Dog(String name, double jumpHeight) {

        this.name = name;
        this.jumpHeight = jumpHeight;


    }
    public void jump(double obstacleHeight) {
        if (obstacleHeight <= jumpHeight) {
            System.out.println(name + " перепрыгнула препядствие высотой " + obstacleHeight + "m");

        } else {
            System.out.println(name + " не смогла перепрыгнуть препядствие высотой " + obstacleHeight + "m");
        }
    }

    public static void main(String[] args) {
        Dog charlie = new Dog("Charlie", 5);

        double [] obstacles = {3, 6, 8, 4, 7, 10, 2, 9, 5, 6};
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("Препядствие " + (i +1) + " высотой " + obstacles[i] + "m");
            charlie.jump(obstacles[i]);
            System.out.println();

        }



    }
}
