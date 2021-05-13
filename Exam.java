(add함수)

public class Exam 
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		int res = add1(a, b);		
		System.out.println("result = " + res);
				
		add2(a, b);
		add3(a, b);
		
	}
	
	
	
	public static int add1(int a, int b)
	{
		int result;
		result = a + b;
		return result;
		
	}
	
	public static void add2(int a, int b)
	{
		int result;
		result = a + b;
		System.out.println("result = " + result);
		
	}
	
	public static int add3(int a, int b)
	{
		int result;
		result = a + b;
		System.out.println("result = " + result);
		return result;
		
	}
}


(add)


public class Example {

	public static void main(String[] args) 
	{
		float a = 1.2f;
		float b = 1.3f;
		float c = 2.9f;
		
		float res = add2(a, b, c);
		System.out.println(res);
		

	}

	
	//3개의 float 값을 받아서 더하고 더한값을 리턴하는 함수를 만들어봅시다.add2
	
	public static float add2(float a, float b, float c)
	{
		float result;
		
		result = a + b + c;
		
		return  result;

 		}

	// 2개의 int값을 입력받아 더하고, "res= 더한값" 출력하는 함수를 만듭니다
	// return형이 없어요 add3
	
	public static void add3(int a, int b) {
		
		
	}
	
}

