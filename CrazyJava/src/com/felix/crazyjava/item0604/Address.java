package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: 定义的Address是不可变类
 * Author: Felix
 * Date: 2017/3/28
 * Time: 13:34
 */
public class Address {

    private final String detail;
    private final String postCode;

    public Address() {
        this.detail = "";
        this.postCode = "";
    }

    public Address(String detail, String postCode) {
        this.postCode = postCode;
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public int hashCode() {
        return detail.hashCode() + postCode.hashCode() * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Address.class) {
            Address add = (Address) obj;
            if (this.getDetail().equals(add.getDetail()) &&
                    this.getPostCode().equals(add.getPostCode())) {
                return true;
            }
        }
        return false;
    }
}
