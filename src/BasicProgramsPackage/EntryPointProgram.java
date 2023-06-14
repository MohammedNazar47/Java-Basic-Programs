package BasicProgramsPackage;

import java.util.Scanner;

public class EntryPointProgram {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the required statements to be executed -> ");
	    System.out.println( " enter 1 : Add two number, " + " enter 2 : To get CouponNumber," + " enter 3 : Ternary method," + " enter 4 : Factorial number," + " enter 5 : MethodOverloading," + " enter 6 : MultiDimenstiomArray," + " enter 7 : Fibonacci Series," + " enter 8 : Overloading Multiple Method," + " enter 9 : Overriding," + " enter 10 : Perfect Number," + " enter 11 : Perfect number through User," + "enter 12 : Prime Number," + "enter 13 : PrimeNumberFrom1_to100," + " enter 14 : Reverse Number," + " enter 15 : Reverse String," + " enter 16 : Swapping Two number");
	    int task = scanner.nextInt();
		switch (task) { 
		case 1 :	AddTwoNumber.add(args);
			break;
		//AddTwoNumber atn = new AddTwoNumber();
		//atn.add(args);
		case 2 :CouponNumber cn = new CouponNumber();
		cn.CodeNumber();
			break;
		
		case 3:ExamplePractice2 xp = new ExamplePractice2();
		xp.ternary();
			break;
		
		case 4:FactorialProgram.fact();
		break;
		
		case 5:MethodOverloading.overload();
			break;
		
		case 6:MultiDimentionArray.Multidimention();
			break;
		
		case 7:FibonacciSeries.fibno();
			break;
		
		case 8:Overloading_Method.methodover();
			break;
		
		case 9:Mainly.override();
			break;
		
		case 10:PerfectNumber.pefectno();
			break;
		
		case 11:PerfectNumberThroughUser.throughperfect();
			break;
		
		case 12:PrimeNumber.primeno();
			break;
		
		case 13:PrimeNumberFrom1_to10_0.noPerfect1_to_100();
			break;
		
		case 14:ReverseNumber.reverseno();
			break;
		
		case 15:ReverseStringProgram.reversestring();
			break;
		
		default : SwapingProgram.swapno();
		
		}
	}

}
