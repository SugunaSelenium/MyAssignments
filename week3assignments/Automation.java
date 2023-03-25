package week3assignments;

public class Automation extends MultipleLangauge implements Language, TestTool{

	public static void main(String[] args) {
		
		Automation allmethods=new Automation();
		allmethods.python();
		allmethods.java();
		allmethods.ruby();
		allmethods.selenium();

	}

	public void selenium() {
		System.out.println("This is selenium");
		
	}

	public void java() {
		System.out.println("This is java");
		
	}

	@Override
	public void ruby() {
		System.out.println("This is ruby");
		
	}

}
