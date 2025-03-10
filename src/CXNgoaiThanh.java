
public class CXNgoaiThanh extends ChuyenXe{
	
	//ô 2
	String noiDen;
	float soNgayDi;
	
	
	
	//ô 3
	CXNgoaiThanh() {
		// TODO Auto-generated constructor stub
	}
	
	CXNgoaiThanh(int _maCX,
			String _hoTenTX,
			String _soXe,
			float _donGia, String _noiDen, float _soNgayDi)
	{
		super(_maCX, _hoTenTX, _soXe, _donGia);
		noiDen = _noiDen;
		soNgayDi = _soNgayDi;
	}
	@Override
	double tinhDoanhThu() {
		double dt;
		dt = donGia * soNgayDi;
		return dt;
	}
	
	

}
