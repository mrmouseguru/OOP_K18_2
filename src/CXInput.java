import java.io.PrintWriter;
import java.util.Scanner;

public class CXInput {

	// ô 2
	Scanner keyboard;
	PrintWriter out;
	CXStorage storage;
	CXOutput cXOut;

	CXInput() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		storage = new CXStorage();
		cXOut = new CXOutput();

	}

	CXInput(Scanner _keyboard, PrintWriter _out) {
		keyboard = _keyboard;
		out = _out;

	}
	
	CXInput(Scanner _keyboard, PrintWriter _out, 
			CXStorage _storage) {
		//keyboard = _keyboard;
		//out = _out;
		//gọi đến hàm khởi tạo 2 tham số 
		//của chính nó
		this(_keyboard, _out);
		storage = _storage;

	}
	
	CXInput(Scanner _keyboard, PrintWriter _out, 
			CXStorage _storage, CXOutput _cXout) {
		//keyboard = _keyboard;
		//out = _out;
		//gọi đến hàm khởi tạo 2 tham số 
		//của chính nó
		//this(_keyboard, _out);
		//storage = _storage;
		this(_keyboard, _out, _storage);
		cXOut = _cXout;

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
		CXNoiThanh cxNoi;
		CXNgoaiThanh cxNgoai;

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
			
			//khởi tạo đối tượng CXNoiThanh
			cxNoi = new CXNoiThanh(maCX, hoTenTX, soXe, donGia, soTuyen, soKm);
			//gửi thông điệp đến đối tượng CXStorage
			storage.insertCXNoiThanh(cxNoi);
			
			//gửi thông điệp đến đối tượng
			//CXOutput
			cXOut.output(cxNoi);
		}
		
		if(loaiCX == 2) {
			out.print("[NHAP SO NGAY DI]");
			out.flush();
			soNgayDi = keyboard.nextFloat();
			keyboard.nextLine();//<===Enter
			
			out.print("[NHAP NOI DEN:]");
			out.flush();
			noiDen = keyboard.nextLine();
			cxNgoai = new CXNgoaiThanh(maCX, hoTenTX, soXe, donGia,
					noiDen, soNgayDi);
			//gửi thông điệp
			storage.insertCXNgoaiThanh(cxNgoai);
			
			//message to CXOutput
			cXOut.output(cxNgoai);
		}

	}

}
