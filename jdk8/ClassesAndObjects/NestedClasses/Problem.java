package ClassesAndObjects.NestedClasses;

public class Problem {
    String s;
	class Inner {
		void testMethod() {
            s = "Set from Inner";
		}
	}
}
