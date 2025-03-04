
public class CXNoiThanh extends ChuyenXe{
	
	//ô 2
	int soTuyen;
	double soKm;
	
	//ô 3
	CXNoiThanh(){
		
	}
	
	CXNoiThanh(int _maCX,
	String _hoTenTX,
	String _soXe,
	float _donGia, int _soTuyen, double _soKm){
		//gọi đến hàm khởi tạo đối tượng
		//4 tham số của cha
		super(_maCX, _hoTenTX, _soXe, _donGia);
		soTuyen = _soTuyen;
		soKm = _soKm;
	}
	
	@Override
	double tinhDoanhThu() {
		double dt;
		dt = donGia * soKm;
		return dt;
	}

}
