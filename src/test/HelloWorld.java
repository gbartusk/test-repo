package test;

public class HelloWorld {

	private String msg;
	
	public HelloWorld() {
		msg = "hello world";
	}
	
	public String getMsg() {
		return this.msg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.getMsg());
	}

}
