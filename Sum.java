public class Sum {
	
 int add(int x,int y){
	 
  while(y!=0){	
      int carry = x & y;
      x = x ^ y;
      y = carry << 1;
	}
   return x;
  }
 
 public static void main (String args[]){
	 
	 Sum c = new Sum();
	 int x = c.add(30,40);
	 System.out.println(x);
 }

}
