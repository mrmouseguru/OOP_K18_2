import java.io.PrintWriter;
import java.util.Scanner;

public class CXMenu {
	
	//ô 2
	PrintWriter out;
	Scanner keyboard;
	String prompt;//lời nhắc
	//bước 1
	CXInput cxInput;
	
	//ô 3
	CXMenu()
	{
		out = new PrintWriter(System.out);
		keyboard = new Scanner(System.in);
		prompt = "->";
		cxInput = new CXInput();
		
	}
	
	CXMenu(PrintWriter _out, Scanner _keyboard, String _prompt)
	{
		out = _out;
		keyboard = _keyboard;
		prompt = _prompt;
		
	}
	
	CXMenu(PrintWriter _out, Scanner _keyboard, String _prompt,
			CXInput _cxInput)
	{
		//out = _out;
		//keyboard = _keyboard;
		//prompt = _prompt;
		this(_out, _keyboard, _prompt);
		cxInput = _cxInput;
		
	}
	
	void controlLoop() {
		out.println("gõ lệnh \"help\" dể được hỗ trợ!");
		out.flush();
		while(true) {
			String command = " ";
			out.print(prompt);
			out.flush();
			command = keyboard.nextLine();//<== HELP , ABOUT, ADD, PRINT
			command = command.trim();//cắt khoảng trắng 2 đầu
			
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
			
			if("exit".equalsIgnoreCase(command)) {
				break;
			}
			
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			
			
		}
		
	}
	
	void add() {
		cxInput.input();
		
	}

	void help() {
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] huong dan su dung phan mem");
		out.flush();
		out.println("[ABOUT] thong tin ve PM quan lý chuyến xe");
		out.flush();
		out.println("[ADD] them mới một chuyến xe");
		out.flush();
		out.println("[PRINT] in tất cả chuyến xe");
		out.flush();
		out.println("[EXIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		
	}

}
