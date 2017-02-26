package module3.homework.task1;

public class Bird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sing("I am walking");
        bird.sing("I am flying");
        bird.sing("I am singing");
        bird.sing("I am Bird");
    }
    public void sing(String string) {
        System.out.println(string);
    }
}
