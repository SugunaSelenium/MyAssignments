package week3.day1;

public class iOS {

			public void startApp() {
			System.out.println("Start the application");
		}
			public void increaseVolume() {
				System.out.println("Volume is increased");
			}
			
			public void shutdown() {
				System.out.println("Shutdown the device");
			}
			
			public static void main(String[] args) {
				iOS os=new iOS();
				os.startApp();
				os.increaseVolume();
				os.shutdown();
				
			}
	}

