
public class TestingStuff {
	
	private static Integer[] alpha = {1,2,3,4};
	private static Integer[] bravo = {1,2,3};
	private static Integer[] charlie = {1,2,3,4,4,4,3,8,364};
	private static Integer[] delta = {1,2,3,4,23,8,2,71};
	private static Integer[] echo = {45,36,-2,26,26,54,6,7,3,29};
	
	
	public static void main(String[] args) {
		
		Stats testOne = new Stats(alpha);
		Stats testTwo = new Stats(bravo);
		Stats testThree = new Stats(charlie);
		Stats testFour = new Stats(delta);
		Stats testFive = new Stats(echo);
		
		System.out.println(testOne.mean());
		System.out.println(testOne.median());
		System.out.println(testOne.mode());
		System.out.println(testOne.range());
		
		System.out.println(testTwo.mean());
		System.out.println(testTwo.median());
		System.out.println(testTwo.mode());
		System.out.println(testTwo.range());
		
		System.out.println(testThree.mean());
		System.out.println(testThree.median());
		System.out.println(testThree.mode());
		System.out.println(testThree.range());
		
		System.out.println(testFour.mean());
		System.out.println(testFour.median());
		System.out.println(testFour.mode());
		System.out.println(testFour.range());
		
		System.out.println(testFive.mean());
		System.out.println(testFive.median());
		System.out.println(testFive.mode());
		System.out.println(testFive.range());
		
		
		
		
	}
	
	
	

}
