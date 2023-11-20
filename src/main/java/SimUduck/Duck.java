package SimUduck;

public abstract class Duck {
    public void quack() {
        System.out.println("꽉꽉!");
    }

    public void swim() {
        System.out.println("첨벙첨벙~");
    }

    public abstract void display();
}
