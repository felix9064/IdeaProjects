package com.felix.web.demo.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/9
 * Time: 20:14
 */
public class User implements Serializable {

    private String userid;
    private String userna;
    private String brchno;
    private String userst;
    private String ussatg;

    private String lastlg;
    private String lstrdt;
    private String usertp;

    private String menugp;

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

    public String getUserst() {
        return userst;
    }

    public void setUserst(String userst) {
        this.userst = userst;
    }

    public String getUssatg() {
        return ussatg;
    }

    public void setUssatg(String ussatg) {
        this.ussatg = ussatg;
    }

    public String getLastlg() {
        return lastlg;
    }

    public void setLastlg(String lastlg) {
        this.lastlg = lastlg;
    }

    public String getLstrdt() {
        return lstrdt;
    }

    public void setLstrdt(String lstrdt) {
        this.lstrdt = lstrdt;
    }

    public String getUsertp() {
        return usertp;
    }

    public void setUsertp(String usertp) {
        this.usertp = usertp;
    }

    public String getMenugp() {
        return menugp;
    }

    public void setMenugp(String menugp) {
        this.menugp = menugp;
    }

}
