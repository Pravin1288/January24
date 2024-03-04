package JanPack2024;

public class Session_03_Constructors {
	
	public Session_03_Constructors() {
		System.out.println("Default Constructor");
	}
	
	public Session_03_Constructors(int a) {
		System.out.println("One Parameterized Constructor " + a);
	}
	
	public Session_03_Constructors(int a, int b) {
		System.out.println("Two Parameterized Constructor " +a +" and " +b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session_03_Constructors obj1 = new Session_03_Constructors();
		//Default Constructor will be called automaitcally
		Session_03_Constructors obj2 = new Session_03_Constructors(2);
		Session_03_Constructors obj3 = new Session_03_Constructors(2, 4);
	}

}
