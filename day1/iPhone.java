package week3.day1;

public class iPhone extends iOS {
	
	public void makeCall() {
		System.out.println("Call triggered");
	}
	
	public void sendSMS() {
		System.out.println("SMS sent");
	}

	public void startApp() {
		System.out.println("Start the application");
	}
	
	public static void main(String[] args) {
		iPhone iP=new iPhone();
		iP.makeCall();
		iP.sendSMS();
		iP.startApp();
	}

}
