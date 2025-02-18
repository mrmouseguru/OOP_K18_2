import java.util.Scanner;

public class AppHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput;
		double chieuDai, chieuRong;
		HinhChuNhat hcn;
		double dienTich;
		double chuVi;
		//input
		keyboardInput = new Scanner(System.in);
		
		System.out.print("[NHAP CHIEU DAI]:");
		chieuDai = keyboardInput.nextDouble();
		System.out.print("[NHAP CHIEU RONG]:");
		chieuRong = keyboardInput.nextDouble();
		
		//xử lý - tính diện tích, chu vi
		//code
		//khởi tạo đối tượng hình chữ nhật
		hcn = new HinhChuNhat(chieuDai, chieuRong);
		//yêu cầu đối tượng hình chữ nhật tính diện tích
		dienTich = hcn.tinhDienTich();
		
		//yêu cầu đối tượng HCN tính chu vi
		chuVi = hcn.tinhChuVi();
		
		//hiển thị kết quả
		System.out.println("Dien tich: " + dienTich);
		System.out.println("Chu vi: " + chuVi);
		
		
		
		

	}

}
