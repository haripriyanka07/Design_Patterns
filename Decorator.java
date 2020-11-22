package com.designprinciples;

interface Mobile{
    public void assemble();
}
class BasicMobile implements Mobile{
    @Override
    public void assemble() {
        System.out.println("Basic Model");
    }
}
class MobileDecorator implements Mobile{
    protected Mobile mobile;

    public MobileDecorator(Mobile m){
        this.mobile = m;
    }

    @Override
    public void assemble() {
        this.mobile.assemble();
    }
}
class TouchScreen extends MobileDecorator{
    public TouchScreen(Mobile m){
        super(m);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding touchscreen feature");
    }
}
class normalphone extends MobileDecorator{
    public normalphone(Mobile m){
        super(m);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding basic normal screen");
    }
}
public class Decorator {
    public static void main(String[] args) {
        Mobile touch = new TouchScreen(new BasicMobile());
        touch.assemble();
        System.out.println();
        Mobile normal = new normalphone(new BasicMobile());
        normal.assemble();
    }
}
