package BasicProgramsPackage;

import java.util.Scanner;

public class EntryPointProgram {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the required statements to be executed -> ");
	    System.out.println( " enter 1 : Add two number, "  + " enter 2 : To get CouponNumber," + " enter 3 : Ternary method," + " enter 4 : Factorial number," + " enter 5 : MethodOverloading," + " enter 6 : MultiDimenstiomArray," + " enter 7 : Fibonacci Series," + " enter 8 : Overloading Multiple Method," + " enter 9 : Overriding," + " enter 10 : Perfect Number," + " enter 11 : Perfect number through User," + "enter 12 : Prime Number," + "enter 13 : PrimeNumberFrom1_to100," + " enter 14 : Reverse Number," + " enter 15 : Reverse String," + " enter 16 : Encapsulation ," + " enter 17 : Overriding ," + " enter 18: Inheritance ," + " enter 19: StopWatch ," + "enter 20: Swapping Two number");
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
			
		case 16: Brain br = new Brain();
                 Brain br1 = new Brain(19,"bhai");
                 Brain br2 = new Brain();
                	br.setName("nazar");
                	br.setAge(17);
             	System.out.println(br.getName() + " " +br.getAge());
   	        	System.out.println(br1.getName() + " " +br1.getAge());
			break;
		case 17: Calculate overriden = new Calculate();
		         int ref = overriden.show(3, 7);
		         System.out.println(ref);
		    break;
		case 18: Solve rf = new Solve();
		         rf.shown(2, 6);
		         break;
		case 19: StopWatch sw = new StopWatch();
			     sw.watch();
			     break;
		default : SwapingProgram.swapno();
		
		}
	}

}
