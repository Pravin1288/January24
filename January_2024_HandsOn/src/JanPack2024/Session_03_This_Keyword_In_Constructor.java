package JanPack2024;

public class Session_03_This_Keyword_In_Constructor {
	
	
	public Session_03_This_Keyword_In_Constructor() {
		System.out.println("Default Constructor");
	}
	
	public Session_03_This_Keyword_In_Constructor(int a) {
		System.out.println("One Parameterized Constructor " + a);
	}
	
	public Session_03_This_Keyword_In_Constructor(int a, int b) {
		this(9);
		System.out.println("Two Parameterized Constructor " +a +" and " +b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session_03_This_Keyword_In_Constructor obj1 = new Session_03_This_Keyword_In_Constructor();
		Session_03_This_Keyword_In_Constructor obj2 = new Session_03_This_Keyword_In_Constructor(2);
		Session_03_This_Keyword_In_Constructor obj3 = new Session_03_This_Keyword_In_Constructor(1, 2);

	}

}
