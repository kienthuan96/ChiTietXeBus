package com.example.thuan.chitietxebus;

import java.util.ArrayList;

/**
 * Created by Thuan on 3/11/2018.
 */

public class Bus {
    String maSo;
    String tenTuyen;
    ArrayList<String> danhsachTram;

    public Bus() {
    }

    public Bus(String maSo, String tenTuyen) {
        this.maSo = maSo;
        this.tenTuyen = tenTuyen;
    }

    public Bus(String maSo, String tenTuyen, ArrayList<String> danhsachTram) {
        this.maSo = maSo;
        this.tenTuyen = tenTuyen;
        this.danhsachTram = danhsachTram;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTenTuyen() {
        return tenTuyen;
    }

    public void setTenTuyen(String tenTuyen) {
        this.tenTuyen = tenTuyen;
    }

    public ArrayList<String> getDanhsachTram() {
        return danhsachTram;
    }

    public void setDanhsachTram(ArrayList<String> danhsachTram) {
        this.danhsachTram = danhsachTram;
    }
}
