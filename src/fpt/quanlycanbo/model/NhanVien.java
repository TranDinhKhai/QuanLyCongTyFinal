/**
 * Copyright(C) 2021 .....
 * NhanVien.java Nov 30, 2021 KhaiTD
 */
package fpt.quanlycanbo.model;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	/**
	 * Phương thức xuLyNhap để thêm bản ghi 
	 * @param congViec ghi chuỗi nhập từ bàn phím
	 * @author Khai
	 */
	public void xuLyNhap() {
		// Ghi đè phương thức xuLyNhap
		super.xuLyNhap();
		// Thông báo nhập thông tin công việc
		System.out.println("Mời Bạn nhập công việc: ");
		// Nhập thông tin công việc từ bàn phím
		congViec = new Scanner(System.in).nextLine();
	}
}
