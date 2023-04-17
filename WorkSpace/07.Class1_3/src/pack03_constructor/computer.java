package pack03_constructor;

public class computer {
	String keyboard, mouse, monitor, speaker;
	
	
	public computer(String keyboard, String mouse, String monitor, String speaker) {
		super();
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.monitor = monitor;
		this.speaker = speaker;
	}


	public static void main(String[] args) {
		computer com = new computer("로지텍","로지텍","삼성","삼성");
		
		System.out.println(com.keyboard);
		System.out.println(com.mouse);
		System.out.println(com.monitor);
		System.out.println(com.speaker);
	}
}
