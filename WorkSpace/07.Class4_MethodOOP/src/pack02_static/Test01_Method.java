package pack02_static;

public class Test01_Method {
	
	
	boolean login(String id, String pw) {
		if(id.equals("master")&&pw.equals("master1234")) {
			return true;
		}
		else {
		return false;}
	}
	
}
