package week3.day1;

public class iPad extends iOS{
	public void watchMovie() {
		System.out.println("Watching new movie");
	}
	

	public static void main(String[] args) {
		iPad tab=new iPad();
		tab.watchMovie();
	}

}
