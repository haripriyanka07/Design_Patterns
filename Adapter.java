package com.designprinciples;

interface Engine{
    public void start();
}
class Automatic{
    public void touchStart() {
        System.out.println("Automatic Engine started");
    }
}
class Manual implements Engine{
    @Override
    public void start() {
        System.out.println("Manual Engine started");
    }
}
class AutomaticAdapter implements Engine{

    Automatic auto;
    public AutomaticAdapter(Automatic auto){
        this.auto = auto;
    }

    @Override
    public void start() {
        auto.touchStart();
    }
}
public class Adapter {
    public static void main(String[] args) {
        Automatic a = new Automatic();
        a.touchStart();

        Manual m = new Manual();
        m.start();

        Engine e = new AutomaticAdapter(a);
        e.start();
    }
}
