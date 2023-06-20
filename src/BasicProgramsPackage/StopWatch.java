package BasicProgramsPackage;

import java.util.Scanner;

public class StopWatch {
	
	long start,end;
	double time;
	public void watch() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Type any character to start the stopwatch");
	char s = sc.next().charAt(0);
	start = System.currentTimeMillis();
	System.out.println("Type any character to stop the stopwatch");
	char e = sc.next().charAt(0);
	end = System.currentTimeMillis();
	time = (end-start)/1000.0;
	System.out.println(time);
	
}
}

