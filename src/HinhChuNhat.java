
public class HinhChuNhat {
	
	//khai báo biến
	double chieuDai;
	double chieuRong;
	
	//khai báo hàm
	HinhChuNhat(){
		chieuDai = 0;
		chieuRong = 0;
	}
	
	HinhChuNhat(double _chieuDai, double _chieuRong)
	{
		chieuDai = _chieuDai;
		chieuRong = _chieuRong;
	}
	
	double tinhDienTich() {
		double dienTich = 0;
		dienTich = chieuDai * chieuRong;
		return dienTich;
	}
	
	double tinhChuVi()
	{
		double chuVi = 0;
		chuVi = (chieuDai + chieuRong) * 2;
		return chuVi;
	}
	
	

}
