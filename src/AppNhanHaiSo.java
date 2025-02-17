import java.util.Scanner;

public class AppNhanHaiSo {

	public static void main(String[] args) {//begin
		// TODO Auto-generated method stub
		//KHAI BÁO BIẾN
		int number1;
		int number2;
		Scanner keyboardInput;
		int tich;
		//INPUT
		//khởi tạo đối tượng
		keyboardInput = new Scanner(System.in);
		System.out.print("[NHAP VAO SO THU NHAT]:");
		number1 = keyboardInput.nextInt();
		System.out.print("[NHAP VAO SO THU HAI]:");
		number2 = keyboardInput.nextInt();
		
		//tinh toan
		//goi hàm tinhTich2So() để tính
		tich = tinhTich2So(number1, number2);
		
		//output
		System.out.println("Tich 2 so: " + tich);
	}//end
	
	//khai báo và định nghĩa hàm tinhTich2So()
	static int tinhTich2So(int a, int b) {//begin function
		int tich;
		tich = a * b;
		return tich;
	}

}
