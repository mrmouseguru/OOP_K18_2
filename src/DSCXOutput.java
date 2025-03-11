import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class DSCXOutput {
	
	//ô 2
	PrintWriter out;
	
	// ô 3
	public DSCXOutput() {
		// TODO Auto-generated constructor stub
		out = new PrintWriter(System.out);
	}
	
	//1 tham số
	
	void ouput(ArrayList<CXNoiThanh> dsCXNoi, 
			ArrayList<CXNgoaiThanh> dsNgoai) {
		
		//xử lý in
		for(CXNoiThanh cxNoi : dsCXNoi) {
			out.println(cxNoi.maCX);
			out.flush();
		}
		
		for(CXNgoaiThanh cxNgoai : dsNgoai) {
			out.println(cxNgoai.maCX);
			out.flush();
		}
	}
	

}
