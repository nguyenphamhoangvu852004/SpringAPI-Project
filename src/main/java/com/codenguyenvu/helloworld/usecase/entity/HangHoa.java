package com.codenguyenvu.helloworld.usecase.entity;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "hang_hoa")
public abstract class HangHoa {
    @Id
    @Column(name = "ma_hang")
    @GeneratedValue(strategy = GenerationType.UUID)
    protected String maHang;
    @Column(name = "ten_hang")
    protected String tenHang;
    @Column(name = "so_luong_ton")
    protected int soLuongTon;
    @Column(name = "don_gia")
    protected double donGia;

    @ManyToOne
    @JoinColumn(name = "ma_loai")
    protected LoaiHang loaiHang;

    public HangHoa() {
    }
    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public LoaiHang getLoaiHang() {
        return loaiHang;
    }
    public void setLoaiHang(LoaiHang loaiHang) {
        this.loaiHang = loaiHang;
    }
    
}
