/**
 * Copyright(C) 2021 .....
 * CanBo.java Nov 30, 2021 KhaiTD
 */
package fpt.quanlycanbo.model;

import java.util.Scanner;

/**
 * Tạo các hàm getter và setter
 * Tạo hàm nhập thông tin cho cán bộ
 * @author KhaiTD
 */
public class CanBo {
	// Khai báo biến, tạo getters setters, constructor, toString
	private String hoTen;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public CanBo() {
		super();
	}

	public CanBo(String hoTen) {
		super();
		this.hoTen = hoTen;
	}
	
	@Override
	public String toString() {
		return this.hoTen + "\t" + this.tuoi + "\t" + this.gioiTinh + "\t" + this.diaChi;
	}
	
	/**
	 * Phương thức xuLyNhap để thêm bản ghi 
	 * @param cb tạo đối tượng
	 * @param strTuoi ghi chuỗi nhập từ bàn phím
	 * @author Khai
	 */
	public void xuLyNhap() {
		// Tạo vòng lặp true để kiểm trả thông tin hợp lệ
		while (true) {
			// Tạo try catch để xử lý ngoại lệ khi xẩy ra
            try {
            		// Tạo một đối tượng cán bộ
					CanBo cb = new CanBo();
					// Thông báo nhập họ tên
					System.out.println("Mời bạn nhập họ tên: ");
					// Nhập họ tên từ bàn phím
					hoTen = new Scanner(System.in).nextLine();
					// Thông báo nhaaph tuổi
					System.out.println("Mời Bạn nhập số tuoi: ");
					// Nhập tuổi từ bán phím
					String strTuoi = new Scanner(System.in).nextLine();
					// Ép kiểu strTuoi sang kiểu số nguyên
					tuoi = Integer.parseInt(strTuoi);
					// Thông báo nhập giới tính
					System.out.println("Mời Bạn nhập giới tính: ");
					// Nhập giới tính từ bàn phím
					gioiTinh = new Scanner(System.in).nextLine();
					// Thông báo nhập địa chỉ
					System.out.println("Mời Bạn nhập địa chỉ: ");
					// Nhập địa chỉ từ bàn phím
					diaChi = new Scanner(System.in).nextLine();
					// Kiểm tra thông tin tuổi đã nhập
					if(tuoi > 0) {
						// Thoát vòng lặp khi thông tin hợp lệ
						break;
					} else {
						// Thông báo nhập lại thông tin cán bộ
						System.out.println("Tuổi bạn nhập < 0, vui lòng nhập lại");
					}
            } catch (Exception ex) {
            	// Thông báo nhập sai và ngoại lệ, xử lý ngoại lệ
            	System.out.println("Tuổi bạn nhập không phải là số nguyên");
            	System.out.println("Class CanBo, phương thức xuLyNhap: " + ex.getMessage());
            	System.out.println("Bạn hãy nhập lại");
            }
        }
	}
}
