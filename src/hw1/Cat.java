package hw1;

public class Cat implements Runable, Jumpble{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " run");
    }

    @Override
    public void jump() {
        System.out.println(name + " jump");
    }
}
