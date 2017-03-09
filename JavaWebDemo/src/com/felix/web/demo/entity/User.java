package com.felix.web.demo.entity;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/9
 * Time: 20:14
 */
public class User {

    private String userid;
    private String userna;
    private String brchno;
    private int userst;
    private int ussatg;

    private int lastlg;
    private int lstrdt;
    private int usertp;

    private int menugp;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserna() {
        return userna;
    }

    public void setUserna(String userna) {
        this.userna = userna;
    }

    public String getBrchno() {
        return brchno;
    }

    public void setBrchno(String brchno) {
        this.brchno = brchno;
    }

    public int getUserst() {
        return userst;
    }

    public void setUserst(int userst) {
        this.userst = userst;
    }

    public int getUssatg() {
        return ussatg;
    }

    public void setUssatg(int ussatg) {
        this.ussatg = ussatg;
    }

    public int getLastlg() {
        return lastlg;
    }

    public void setLastlg(int lastlg) {
        this.lastlg = lastlg;
    }

    public int getLstrdt() {
        return lstrdt;
    }

    public void setLstrdt(int lstrdt) {
        this.lstrdt = lstrdt;
    }

    public int getUsertp() {
        return usertp;
    }

    public void setUsertp(int usertp) {
        this.usertp = usertp;
    }

    public int getMenugp() {
        return menugp;
    }

    public void setMenugp(int menugp) {
        this.menugp = menugp;
    }

}
