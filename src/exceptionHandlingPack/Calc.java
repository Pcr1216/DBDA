public class Calc
{
	public int sqr(int num)throws MyException
{
		if (num<=0) {
			throw new MyException("Zero or negative not allowed");
		}
			return num*num;

			// try{
			// 	if (num<=0) {
			// 		throw new MyException("Zero or negative not allowed");
			// 		}
			// 		return num*num;
				
			// }
			// catch(MyException e){
			// 	System.out.println("I have been printed");
			// }
			// return 0;
		
			
	}
}