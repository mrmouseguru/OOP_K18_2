import java.util.ArrayList;

public class DSCXStorage {
	
	// ô 2
	
	
	//ô 3
	public DSCXStorage() {
		
	}
	ArrayList<CXNoiThanh> getDSCXNoiThanh(){
		ArrayList<CXNoiThanh> dsCXNoiThanh;
		dsCXNoiThanh = MemoryCXDB.getCXNoiThanh();
		return dsCXNoiThanh;
	}
	
	ArrayList<CXNgoaiThanh> getDSCXNgoaiThanh(){
		return MemoryCXDB.getCXNgoaiThanh();
	}

}
