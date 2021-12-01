/**
 * Copyright(C) 2021 .....
 * CongNhan.java Nov 30, 2021 KhaiTD
 */
package fpt.quanlycanbo.model;

import java.util.Scanner;
/**
 * Tạo class CongNhan extends CanBo
 * Tạo các hàm getter và setter
 * Tạo hàm nhập thông tin cho Công nhân
 * @author KhaiTD
 */
public class CongNhan extends CanBo {
	// Khai báo biến bacLuong
	private int bacLuong;
	// Tạo các hàm getter
	public int getBacLuong() {
		return bacLuong;
	}
	// Tạo các hàm setter
	public void setBacLuong(int bacLuong) {
		this.bacLuong = bacLuong;
	}
	// Tạo phương thức toString 
	@Override
	public String toString() {
		return super.toString()+"\t"+this.bacLuong;
	}
	/**
	 * Phương thức xuLyNhap để thêm bản ghi 
	 * @param strBacLuong ghi chuỗi nhập từ bàn phím
	 * @author Khai
	 */
	public void xuLyNhap() {
		// Tạo vòng lặp true để nhập thông tin
		while (true) {
			// Xây dựng try catch để xử lý ngoại lệ
            try {
            	// Ghi đè phương thức xuLyNhap
            	super.xuLyNhap();
            	// Thông báo nhập bậc lương
        		System.out.println("Mời Bạn nhập bậc lương: ");
        		// Nhập bậc lương từ bàn phím
        		String strBacLuong = new Scanner(System.in).nextLine();
        		// Ép kiểu sang số nguyên
        		bacLuong = Integer.parseInt(strBacLuong);
        		// Kiểm tra hợp lệ bậc lương đã nhập
        		if (bacLuong >= 1 && bacLuong <= 10) {
        			// Thoát vòng lặp true khi thông tin hợp lệ
        			break;
        		} else {
        			// Thông báo nhập lại
					System.out.println("Bậc lương không hợp lệ ( >= 0 và <= 10), nhập lại");
				}
            } catch (Exception ex) {
            	// Thông báo ngoại lệ, xử lý và yêu cầu nhập lại
            	System.out.println("Bậc lương bạn nhập không phải là số nguyên");
            	System.out.println("Class Công nhân, phương thức xuLyNhap: " + ex.getMessage());
            	System.out.println("Bạn hãy nhập lại");
            }
        }
	}	
}
