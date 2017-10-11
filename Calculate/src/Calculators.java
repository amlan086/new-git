import java.util.Scanner;
public class Calculators {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Result Result = new Result();
		double res=0,a,b;
		char op;
		 boolean i=true;
		while(i==true)
		{
		
			System.out.print("For trigonmetric operation  input 1 else input 2");	
			int chk=input.nextInt();
			
			if(chk==2)
			{
		System.out.print("Enter the numbers and operator with space :");	
		a = input.nextDouble();
		op = input.next().charAt(0);
		b = input.nextDouble();
		
		   switch (op) {
           case '+': res = Result.add(a, b);
                     break;
           case '-': res = Result.subtract(a, b);
                     break;
           case '*': res = Result.multiply(a, b);
                     break;
           case '/': res = Result.divide(a, b);
                     break;
           case '^': res = Result.power(a, b);
                     break;
                     
                     
       }}
			else
			{
		   
				System.out.print("Enter the cos or sin or tan   and the value in degree :");	
				String s = input.next();
				a = input.nextDouble();
				//System.out.println(s);
			if(s.equals("cos") )	
			{   System.out.println(s);
				double angleInDegree = a;
				double angleInRadian = Math.toRadians(angleInDegree);
				double cos = Math.cos(angleInRadian);
				res=cos;
		   
			}
			
			else if(s.equals("sin") )	
			{   System.out.println(s);
			double angleInDegree = a;
			double angleInRadian = Math.toRadians(angleInDegree);
			double cos = Math.sin(angleInRadian);
			res=cos;
			}
			
			else if(s.equals("tan") )	
			{   System.out.println(s);
			double angleInDegree = a;
			double angleInRadian = Math.toRadians(angleInDegree);
			double cos = Math.tan(angleInRadian);
			res=cos;
			}
		
			
			}
		  
           System.out.println(res); 
			
			
			
		}
		input.close();
		
		
   
}
	}
