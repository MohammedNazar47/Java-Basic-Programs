package BasicProgramsPackage;

class OverridingProgram {
	
	void ride() {
		System.out.println("you can riding the bike");
	}
}

	class MethodOverriding1 extends OverridingProgram  {
		
		void ride() {
			System.out.println("You can't riding the bike");
		}
	}
	
	class mainly{
		public static void main(String [] args) {
			OverridingProgram  Mo = new MethodOverriding1();
			Mo.ride();
		}
	}

