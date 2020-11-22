package com.designprinciples;

import java.rmi.Remote;

abstract class TV{
    Remo remote;
    TV(Remo r){
        this.remote = r;
    }
    abstract void on();
    abstract void off();
}
interface Remo{
    public void on();
    public void off();
}
class Sony extends TV{
    Remo type;
    Sony(Remo r){
        super(r);
        this.type = r;
    }
    public void on(){
        System.out.println("SONY ON");
        type.on();
    }
    public void off(){
        System.out.println("SONY OFF");
        type.off();
    }
}
class LG extends TV{
    Remo type;
    LG(Remo r){
        super(r);
        this.type = r;
    }
    public void on(){
        System.out.println("LG ON");
        type.on();
    }
    public void off(){
        System.out.println("LG OFF");
        type.off();
    }
}
class Old implements Remo{

    @Override
    public void on() {
        System.out.println("ON OLD");
    }

    @Override
    public void off() {
        System.out.println("OFF OLD");
    }
}
class New implements Remo{

    @Override
    public void on() {
        System.out.println("ON New");
    }

    @Override
    public void off() {
        System.out.println("OFF new");
    }
}
public class Bridge {
    public static void main(String[] args) {
        TV sonyOld = new Sony(new Old());
        sonyOld.on();
        sonyOld.off();

        TV lgOld = new LG(new Old());
        lgOld.on();
        lgOld.off();

        TV sonyNew = new Sony(new New());
        sonyNew.on();
        sonyNew.off();

        TV lgNew = new LG(new New());
        lgNew.on();
        lgNew.off();

    }
}
