import java.util.ArrayList;

public class DSCXControl {
	
	//ô 2
	DSCXStorage dsCXStorage;
	DSCXOutput dsCXOutput;
	
	
	// ô 3
	DSCXControl(){
		dsCXStorage = new DSCXStorage();
		dsCXOutput = new DSCXOutput();
		
	}
	
	DSCXControl(DSCXStorage _dsCXStorage, 
			DSCXOutput _dsCXOutput){
		
	}
	
	void printDSCX() {
		ArrayList<CXNoiThanh> dsCXNoiThanh;
		ArrayList<CXNgoaiThanh> dsCXNgoaiThanh;
		
		//lấy dữ liệu
		dsCXNoiThanh = dsCXStorage.getDSCXNoiThanh();
		dsCXNgoaiThanh = dsCXStorage.getDSCXNgoaiThanh();
		
		//in
		dsCXOutput.ouput(dsCXNoiThanh, dsCXNgoaiThanh);
	}
	

}
