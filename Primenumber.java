public class PrimeNumber {

	public static void main (String[] args) {
		 int val = 8;
		 int a =2;
		 boolean Primenumber = true;
		 
		 for(int i = 0; i < val -2; i++) {
			
			 if(val % a == 0)
			 {
				 Primenumber = false;
				 break;
			 }
			 a++;
		 }
		 if(Primenumber == true)
		 {
	 System.out.println(val + "=" + "소수입니다");
		 }
		 else
		 {
    System.out.println(val + "=" + "합성수입니다");
		 }
      }
   }
	
