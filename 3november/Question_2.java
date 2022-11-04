/* print a pattrn
1
10\
101
1010
10101*/
package shruti;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i,j;
 for(i=1;i<=5;i++) {
	 for(j=1;j<=i;j++) {
		 if(j%2==0) {
			 System.out.print("0");
			 }
		 else {
			 System.out.print("1");
		 }
		
	 }
	 System.out.println();
 }
		
				
		

}
}
