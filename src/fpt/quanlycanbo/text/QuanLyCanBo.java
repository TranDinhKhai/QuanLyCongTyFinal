/**
 * Copyright(C) 2021 .....
 * QuanLyCanBo.java Nov 30, 2021 KhaiTD
 */
package fpt.quanlycanbo.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import fpt.quanlycanbo.model.CanBo;
import fpt.quanlycanbo.model.CongNhan;
import fpt.quanlycanbo.model.KySu;
import fpt.quanlycanbo.model.NhanVien;
/**
 * Tạo phương thức menu, xuLyNhap, xuLyTim, xuLyXuat, xuLyThoat()
 * Tạo một arraylist để lưu danh sách các cán bộ
 * @author KhaiTD
 */
public class QuanLyCanBo {
	// Tạo ArrayList để ghi danh sách cán bộ
	static List<CanBo> dsCanBo = new ArrayList<CanBo>();
	/**
	 * Tạo phương thức menu, xuLyNhap, xuLyTim, xuLyXuat, xuLyThoat()
	 * @param chon nhập option từ người dùng
	 * @param c nhập loại cán bộ
	 * @author KhaiTD
	 */
	public static void menu() {
		// Thông báo các chức năng
		System.out.println("1. Thêm mới cán bộ");
		System.out.println("2. Tìm kiếm theo họ tên");
		System.out.println("3. Xuất danh sách cán bộ");
		System.out.println("4. Thoát");
		// Thông báo yêu cầu chọn chức năng
		System.out.print("Bạn chọn chức năng [1..4]: ");
		System.out.println();
		// Tạo biến chọn để chọn chức năng thực hiện
		int chon = 0;
		chon = new Scanner(System.in).nextInt();
		// Tạo switch case để thực hiện theo các chức năng đã chọn
		switch (chon) {
		case 1:
			xuLyNhap();
			break;
		case 2:
			xuLyTim();

			break;
		case 3:
			xuLyXuat();
			break;
		case 4:
			xuLyThoat();
			break;
		default:
			break;
		}
	}
	/**
	 * Tạo phương thức thoát chương trình
	 * @author KhaiTD
	 */
	private static void xuLyThoat() {
		// Thông báo thoát chương trình
		System.out.println("Cảm ơn bạn đã dùng phần mềm! bye bye...");
		// Thực hiện thoát
		System.exit(0);
	}
	/**
	 * Tạo phương thức xuất thông tin cán bộ
	 * @author KhaiTD
	 */
	private static void xuLyXuat() {
		System.out.println("========================================");
		//duyệt các phần tử bằng sử dụng phương thức tham chiếu trong stream ipa
		dsCanBo.forEach(System.out::println);
	}
	/**
	 * Tạo phương thức tìm thông tin cán bộ theo tên
	 * @author KhaiTD
	 */
	private static void xuLyTim() {
		// Nhập họ tên muốn tìm
		String hoTen = new Scanner(System.in).nextLine();
		System.out.println("==============================");
		System.out.println("Danh sách cán bộ có tên bạn tìm: ");
		//duyệt các phần tử bằng sử dụng phương thức tham chiếu trong stream ipa
		dsCanBo.forEach(System.out::println);
	}
	/**
	 * Phương thức xuLyNhap để thêm bản ghi 
	 * @param c để chọn loại nhân viên
	 * @param strTuoi ghi chuỗi nhập từ bàn phím
	 * @author Khai
	 */
	static void xuLyNhap() {
		// Thông báo nhập thông tin
		System.out.println("Nhập thông tin cho nhân viên");
		// Thông báo cách nhập
		System.out.print("Chọn loại nhân viên (1 - Công nhân, 2 - Kỹ sư, 3 - Nhân Viên):");
		// Nhập biến c từ bàn phím
		int c = new Scanner(System.in).nextInt();
		// Thực hiện các chức năng theo loại nhân viên
		switch (c) {
		case 1:
			CongNhan cn = new CongNhan();
			cn.xuLyNhap();
			dsCanBo.add(cn);
			break;
		case 2:
			KySu ks = new KySu();
			ks.xuLyNhap();
			dsCanBo.add(ks);
			break;
		case 3:
			NhanVien nv = new NhanVien();
			nv.xuLyNhap();
			dsCanBo.add(nv);
			break;
		default:
			break;
		}
	}
	/**
	 * Phương thức main để chạy chương trình
	 * @author Khai
	 */
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}

}
