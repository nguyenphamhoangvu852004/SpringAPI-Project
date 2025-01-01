package com.codenguyenvu.helloworld.usecase.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "loai_hang")
public class LoaiHang {

    @Id
    @Column(name = "ma_loai", length = 5)
    private String maLoai;

    @Column(name = "ten_loai", length = 50)
    private String tenLoai;

    public LoaiHang() {
    }
    public LoaiHang(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }
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
    @Override
    public String toString() {
        return "LoaiHang [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
    }
    
}
