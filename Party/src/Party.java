
public class Party {
	 public static void main(String [] args) {
		 int x = 0;
		 int sum = 0;
		 for(int i = 1 ; sum <= 236 ; i ++ ) {
			 sum += i;
			 x = i;
		 }
		 
		 System.out.println(x);
		 
		 sum = 0;
		 
		 int y = 0 ;
		 for(int i = x ; sum <= 236 ;i --) {
			 sum += i;
			 y = i;
		 }
		 
		 System.out.println(y);
	 }
}
