package com.codenguyenvu.helloworld.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "loaihang")
public class LoaiHang {

    @Id
    @Column(name = "maLoai", length = 5)
    private String maLoai;

    @Column(name = "tenLoai", length = 50)
    private String tenLoai;

    // getters and setters
    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
}
