package JanPack2024;

public class Session_02_Arithmetic_Operations {
	
	public int sum (int a, int b) {
		int c = a+b;
		System.out.println("Sum Value = " + c);
		return c;		
	}
	
	public int sub (int x, int y) {
		int z = x-y;
		System.out.println("Sub Value = " + z);
		return z;		
	}
	
	public void Mux (int i, int j) {
		int k = i * j;
		System.out.println("Result is " + k);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session_02_Arithmetic_Operations obj = new Session_02_Arithmetic_Operations();
		//Storing in a variable, why?? bcoz it is a returning value also we need return results in the Multiple Method (MUX)
		int SumResult = obj.sum(8, 2);
		int SubResult = obj.sub(10, 4); 
		//obj.Mux(20, 30);
		obj.Mux(SumResult, SubResult);
		
		
		//Hands-On //Calling Sum + Sub twice
		int SumResult2 = obj.sum(SumResult, 1);
		int SubResult2 = obj.sub(SubResult, 3);
		obj.Mux(SumResult2, SubResult2);
	}

}
