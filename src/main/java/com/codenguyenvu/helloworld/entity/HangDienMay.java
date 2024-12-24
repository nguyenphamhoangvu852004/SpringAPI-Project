package com.codenguyenvu.helloworld.entity;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class HangDienMay extends HangHoa {

    @Column(name = "thoiGianBaoHanh")
    private int thoiGianBaoHanh;

    @Column(name = "congSuat")
    private double congSuat;

    // getters and setters
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
}
