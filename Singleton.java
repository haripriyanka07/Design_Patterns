package com.designprinciples;

class SingletonEagar {
    private static SingletonEagar instance = new SingletonEagar();

    private SingletonEagar(){}

    public static SingletonEagar getInstance() {
        return instance;
    }
}

class Singletonlazy {
    private static Singletonlazy instance;

    private Singletonlazy(){}

    public static Singletonlazy getInstance() {
        if(instance == null) {
            instance = new Singletonlazy();
        }

        return instance;
    }
}

class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod(){}

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if(instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}

class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized(){}

    public static SingletonSynchronized getInstance() {
        if(instance == null) {
            synchronized (SingletonSynchronized.class) {
                if(instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}

public class Singleton{

    public static void main(String[] args) {
        SingletonEagar instance = SingletonEagar.getInstance();

        System.out.println(instance);

        SingletonEagar instance1 = SingletonEagar.getInstance();

        System.out.println(instance1);
    }
}