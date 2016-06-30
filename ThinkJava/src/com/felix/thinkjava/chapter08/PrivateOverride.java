package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class PrivateOverride {

    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

}

class Derived extends PrivateOverride {
    public void f() {
       System.out.println("public f()");
    }
}
