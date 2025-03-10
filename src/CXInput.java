import java.io.PrintWriter;
import java.util.Scanner;

public class CXInput {

	// ô 2
	Scanner keyboard;
	PrintWriter out;

	CXInput() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);

	}

	CXInput(Scanner _keyboard, PrintWriter _out) {
		keyboard = _keyboard;
		out = _out;

	}

	void input() {
		// code
		int maCX;
		String hoTenTX;
		String soXe;
		float donGia;
		int loaiCX;
		int soTuyen;
		float soKm;
		float soNgayDi;
		String noiDen;

		out.print("[MA CHUYEN XE]:");
		out.flush();
		maCX = keyboard.nextInt();// <===1111Enter
		keyboard.nextLine();// nhận phím Enter

		// họ tên tài xế
		out.print("[NHAP HO TEN TAI XE:]");
		out.flush();
		hoTenTX = keyboard.nextLine();

		// số xe
		out.print("[NHAP SO XE:]");
		out.flush();
		soXe = keyboard.nextLine();
		// nhập đơn giá
		out.print("[NHAP DON GIA:]");
		out.flush();
		donGia = keyboard.nextFloat();

		// sự lựa chọn loại chuyến xe nào?
		// nhập sự lựa chọn
		out.print("[CHỌN LOẠI CHUYẾN XE \n1 - Noi Thanh / 2 - Ngoai Thanh]");
		out.flush();
		loaiCX = keyboard.nextInt();

		// kiểm tra
		if (loaiCX == 1) {//nọi thành
			out.print("[NHAP SO TUYEN:]");
			out.flush();
			soTuyen = keyboard.nextInt();

			out.print("[NHAP SO KM:]");
			out.flush();
			soKm = keyboard.nextFloat();
		}
		
		if(loaiCX == 2) {
			out.print("[NHAP SO NGAY DI]");
			out.flush();
			soNgayDi = keyboard.nextFloat();
			keyboard.nextLine();//<===Enter
			
			out.print("[NHAP NOI DEN:]");
			out.flush();
			noiDen = keyboard.nextLine();
		}

	}

}
