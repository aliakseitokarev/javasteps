public class Calculate {
	
	public static void main(String[] arg){
		System.out.println("Calculating...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double summ = first + second;
		double subt = first - second;
		double mult = first*second;
		double div = first/second;
		int deg = (int) Math.pow(first, second);
		System.out.println("Sum " + summ);
		System.out.println("Subtraction " + subt);
		System.out.println("Multiplication " + mult);		
		System.out.println("Division " + div);
		System.out.println("Elevate " + deg);
		
	} 

}