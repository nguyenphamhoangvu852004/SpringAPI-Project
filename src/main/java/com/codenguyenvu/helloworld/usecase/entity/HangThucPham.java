package com.codenguyenvu.helloworld.usecase.entity;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "hang_thuc_pham")
public class HangThucPham extends HangHoa {
    @Column(name = "ngay_san_xuat")
    private java.sql.Date ngaySanXuat;

    @Column(name = "ngay_het_han")
    private java.sql.Date ngayHetHan;

    @Column(name = "nha_cung_cap")
    private String nhaCungCap;

    public HangThucPham() {
    }
    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia,  Date ngaySanXuat, Date ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia); // Gọi constructor của HangHoa
      
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }
    public java.sql.Date getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(java.sql.Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    public java.sql.Date getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(java.sql.Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    public String getNhaCungCap() {
        return nhaCungCap;
    }
    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
    @Override
    public String toString() {
        return "HangThucPham [ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + ", nhaCungCap=" + nhaCungCap
                + ", maHang=" + maHang + ", tenHang=" + tenHang + ", soLuongTon=" + soLuongTon + ", donGia=" + donGia
                + ", loaiHang=" + loaiHang + "]";
    }
    
}
