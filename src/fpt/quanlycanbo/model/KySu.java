/**
 * Copyright(C) 2021 .....
 * KySu.java Nov 30, 2021 KhaiTD
 */
package fpt.quanlycanbo.model;

import java.util.Scanner;

/**
 * Tạo class KySu extends CanBo
 * Tạo các hàm getter và setter
 * Tạo hàm nhập thông tin cho KySu
 * @author KhaiTD
 */
public class KySu extends CanBo{
	private String nganh;

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	/**
	 * Phương thức xuLyNhap để thêm bản ghi 
	 * @param nganh ghi chuỗi nhập từ bàn phím
	 * @author Khai
	 */
	public void xuLyNhap() {
		// Ghi đè phương thức xuLyNhap
		super.xuLyNhap();
		// Thông báo nhập ngành đào tạo
		System.out.println("Mời Bạn nhập ngành đào tạo: ");
		// Nhập nghành đào tạo từ bàn phím
		nganh = new Scanner(System.in).nextLine();
	}
}
