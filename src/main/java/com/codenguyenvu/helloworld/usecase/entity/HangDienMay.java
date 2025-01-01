package com.codenguyenvu.helloworld.usecase.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hang_dien_may")
public class HangDienMay extends HangHoa {

    @Column(name = "thoi_gian_bao_hanh")
    private int thoiGianBaoHanh;

    @Column(name = "cong_suat")
    private double congSuat;

    public HangDienMay() {
    }
    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia,  int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }
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
    @Override
    public String toString() {
        return "HangDienMay [thoiGianBaoHanh=" + thoiGianBaoHanh + ", congSuat=" + congSuat + ", maHang=" + maHang
                + ", tenHang=" + tenHang + ", soLuongTon=" + soLuongTon + ", donGia=" + donGia + ", loaiHang="
                + loaiHang + "]";
    }
    
}
