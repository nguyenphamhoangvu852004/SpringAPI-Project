package com.codenguyenvu.helloworld;

import java.sql.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.codenguyenvu.helloworld.database.HangHoaDAO;
import com.codenguyenvu.helloworld.database.LoaiHangDAO;
import com.codenguyenvu.helloworld.usecase.entity.HangThucPham;
import com.codenguyenvu.helloworld.usecase.entity.LoaiHang;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(HangHoaDAO hangHoaDAO, LoaiHangDAO loaiHangDAO) {
//		return args -> {
////			addLoaiHang(loaiHangDAO);
////			addHangThucPham(hangHoaDAO, loaiHangDAO);
////			getAllLoaiHang(loaiHangDAO);
////			getAllHangHoa(hangHoaDAO);
//		};
//	}
	
	public void addLoaiHang(LoaiHangDAO loaiHangDAO) {
		LoaiHang loaiHang = new LoaiHang();
		loaiHang.setMaLoai("HDM");
		loaiHang.setTenLoai("Hàng điện máy");
		loaiHangDAO.insert(loaiHang);
		loaiHang = new LoaiHang();
		loaiHang.setMaLoai("HTP");
		loaiHang.setTenLoai("Hàng thực phẩm");
		loaiHangDAO.insert(loaiHang);
		loaiHang = new LoaiHang();
		loaiHang.setMaLoai("HSS");
		loaiHang.setTenLoai("Hàng sành sứ");
		loaiHangDAO.insert(loaiHang);
	}
	public void getAllLoaiHang(LoaiHangDAO loaiHangDAO) {
		loaiHangDAO.getAll().forEach(System.out::println);
	}
	public void addHangThucPham(HangHoaDAO hangHoaDAO, LoaiHangDAO loaiHangDAO) {
    HangThucPham hangThucPham = new HangThucPham();
    hangThucPham.setTenHang("Gạo4");    // Tên hàng
    hangThucPham.setDonGia(50000.0);   // Đơn giá
    hangThucPham.setNgaySanXuat(Date.valueOf("2024-01-01"));
    hangThucPham.setNgayHetHan(Date.valueOf("2025-01-01"));
    hangThucPham.setNhaCungCap("Công ty ABC");

	LoaiHang loaiHang = loaiHangDAO.get("HTP");

	hangThucPham.setLoaiHang(loaiHang);

	hangHoaDAO.insert(hangThucPham);
	}
	public void getAllHangHoa(HangHoaDAO hangHoaDAO) {
		hangHoaDAO.getAll().forEach(System.out::println);
	}
}
