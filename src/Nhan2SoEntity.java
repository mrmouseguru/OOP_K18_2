
public class Nhan2SoEntity {
	
	
	//khai báo các biến
	int number1;
	int number2;
	
	//khai báo và định nghĩa hàm
	//constructor
	Nhan2SoEntity(int a, int b){
		number1 = a;
		number2 = b;
	}
	
	int nhan2So() {
		int tich;
		tich = number1 * number2;
		return tich;
	}

}
