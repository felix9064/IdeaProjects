package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: 带有引用类型成员变量的不可变类
 * Author: Felix
 * Date: 2017/3/28
 * Time: 13:54
 */
public class Person {
    private final Name name;

    /*
    public Person(Name name) {
        this.name = name;
    }
    */

    /*
    public Name getName() {
        return name;
    }
    */

    public Person(Name name) {
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName() {
        return new Name(name.getFirstName(), name.getLastName());
    }

    public static void main(String[] args) {
        Name n = new Name("三", "张");
        Person p = new Person(n);

        System.out.println(p.getName().getFirstName());

        n.setFirstName("四");
        n.setLastName("李");
        System.out.println(p.getName().getFirstName() + " " + p.getName().getLastName());

        p.getName().setLastName("四");
        p.getName().setFirstName("李");
        System.out.println(p.getName().getFirstName() + " " + p.getName().getLastName());

    }
}

class Name{

    private String firstName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
