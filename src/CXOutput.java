import java.io.PrintWriter;

public class CXOutput {
	
	//ô 2
	PrintWriter out;
	
	// ô 3
	CXOutput(){
		out = new PrintWriter(System.out);
	}
	
	CXOutput(PrintWriter _out){
		out = _out;
	}
	
	void output(CXNoiThanh cx) {
		out.println("Da lưu CX nội thành thành công!!!");
		out.flush();
		out.print("Ma CX: " + cx.maCX);
		out.flush();
	}
	
	void output(CXNgoaiThanh cx) {
		out.println("Da lưu CX ngoại thành thành công!!!");
		out.flush();
		out.print("Ma CX: " + cx.maCX);
		out.flush();
	}


}
