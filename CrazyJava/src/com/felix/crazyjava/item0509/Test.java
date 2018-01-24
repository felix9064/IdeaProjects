package com.felix.crazyjava.item0509;

/**
 * Created with IntelliJ IDEA.
 * Description: 初始化块和构造器的调用顺序
 * Author: Felix
 * Date: 2018/1/22
 * Time: 15:56
 */
public class Test {
    public static void main(String[] args) {
        new Leaf();
        System.out.println("两个对象的间隔\n");
        new Leaf();
    }
}

class Root {
    static {
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的普通初始化块");
    }

    public Root() {
        System.out.println("Root的无参构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid的静态初始化块");
    }

    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid() {
        System.out.println("Mid的无参构造器");
    }

    public Mid(String msg) {
        this();
        System.out.println("Mid的带参构造器，参数值为：" + msg);
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf() {
        super("红红火火恍恍惚惚");
        System.out.println("Leaf的无参构造器");
    }
}
