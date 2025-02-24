import java.util.Scanner;

public class AppDemoBien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai báo biến cơ bản có tên là
		//tuoiSinhVien có kiểu dư liệu cơ bản
		// int
		//gán cho nó giá trị 20
		int tuoiSinhVien = 20;
		
		//Biến tham chiếu đối tượng
		//Bước 1
		//khai báo biến tham chiếu đối tượng
		//có tên là hcn
		//Có kiểu dữ liệu tham chiếu đối tương
		//là HinhChuNhat
		HinhChuNhat hcn;
		hcn.chieuDai = 50;
		hcn.tinhChuVi();
		//Bước 2
		//khởi tạo đối tượng trong vùng nhớ Heap
		hcn = new HinhChuNhat();
		
		//bước 3: 
		//trỏ biến hcn đến đối tượng trong Heap
		//hcn =
		hcn.chieuDai = 50;
		//hcn.chieuRong;
		hcn.tinhChuVi();
		
		//rút gọn
		//bước 1    bước 3
		HinhChuNhat hcn2 =
				//Bước 2
				new HinhChuNhat(10, 5);
		hcn2.tinhChuVi();
		
		//nhập vào từ bàn phím
		//bước 1
		Scanner keyboard;
		keyboard.nextLine();
		//bước 2 khởi tạo đối tượng
		keyboard = new Scanner(System.in);
		
		//
		keyboard.nextLine();

	}

}
