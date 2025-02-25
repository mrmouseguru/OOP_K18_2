
public class SinhVien {
	
	//khai báo biến
	int maSinhVien;
	String hoTen;
	float diemLT;
	float diemTH;
	
	//hàm
	SinhVien()
	{
		maSinhVien = 0;
		hoTen = null;
		diemLT = 0;
		diemTH = 0;
		
	}
	
	SinhVien(int _maSinhVien, String _hoTen, float _diemLT,
			float _diemTH)
	{
		//code
		maSinhVien = _maSinhVien;
		hoTen = _hoTen;
		diemLT = _diemLT;
		diemTH = _diemTH;
	}
	
	float tinhDiemTrungBinh()
	{
		float diemTB;
		diemTB = (diemLT + diemTH)/2;
		return diemTB;
	}
	
	//toString()
	

}
