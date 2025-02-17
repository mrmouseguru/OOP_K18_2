import java.util.Scanner;

public class Nhan2SoUI {
	
	//khai báo biến
	Scanner keyboardInput;
	Nhan2SoEntity nhan2So;
	
	//khai báo và định nghĩa các hàm
	//constructor - hàm khởi tạo đối tượng
	//có tên trùng với tên class
	//không có kiểu dữ liệu trả về
	Nhan2SoUI(){
		//code
		keyboardInput = new Scanner(System.in);
	}
	
	void input() {
		//code
		int number1, number2, tich;
		System.out.print("[NHAP VAO SO THU NHAT]:");
		number1 = keyboardInput.nextInt();
		System.out.print("[NHAP VAO SO THU HAI]:");
		number2 = keyboardInput.nextInt();
		
		//gọi hàm == gửi thông điệp cho đối tượng Nhan2SoEntity
		nhan2So = new Nhan2SoEntity(number1, number2);
		tich = nhan2So.nhan2So();
		
		//in ket qua
		System.out.println("Tich 2 so: " + tich);
	}

}
