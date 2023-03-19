package week3.day1;

public class Students {

	public static void getStudentInfo(int id) {
		System.out.println("Student id is : "+ id);
	}
	
    public static void getStudentInfo(int id, String name) {
		System.out.println("Student id is: " + id +" , and name is: "+ name);
	}

    public static void getStudentInfo(String email,int phonenumber) {
    	System.out.println("student email is "+ email +" , and phonenumber is: " + phonenumber);
    }

	public static void main(String[] args) {
		getStudentInfo(190036);
		getStudentInfo(6787, "Senthilkumar");
		getStudentInfo("Selenium@gmail.com",912345679);
	}

}