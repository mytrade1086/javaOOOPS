package typecastingTrial;

public class ClassParent implements ISoloInterface {

	public int addNum(int a, int b) {
		int result = a + b;
		System.out.println("Result of Addition is :" + result);
		return result;
	}

	public int subNum(int a, int b) {
		int result = a - b;
		System.out.println("Result of Subtraction is :" + result);
		return result;
	}

	public int multiply(int a, int b) {
		int result = a * b;
		System.out.println("Result of Multiplication is :" + result);
		return result;
	}

	public void parentmethod() {
		System.out.println("Printing from Parent");

	}

	public static void main(String[] args) {

		ClassParent cp = new ClassParent(); // Normal reference and object creation
		System.out
				.println("#####Calling Parent Class methods with Parent Reference####################################");
		cp.addNum(10, 20);
		cp.subNum(10, 20);
		cp.multiply(10, 20);

//		#####Calling Parent Class methods with Parent Reference####################################
//		Result of Addition is :30
//		Result of Subtraction is :-10
//		Result of Multiplication is :200
//		

		System.out
				.println("#####Calling Implemented method with Interface Reference and Implemented class object######");
		ISoloInterface is = new ClassParent(); // ##Interface reference can hold Implementing class object
		is.addNum(100, 200);
		is.subNum(100, 200);
		// is.multiply(10, 20); Not Possible//##Interface reference wont be able to
		// access own method of the class
		// access multiply which is a class method only

//		
//		#####Calling Implemented method with Interface Reference and Implemented class object######
//		Result of Addition is :300
//		Result of Subtraction is :-100

		System.out.println(
				"#####Calling Parent and child class method with child class object and reference############");
		// ########################################################################################################################
		ClassChild cc = new ClassChild();
		cc.addNum(10, 20);
		cc.subNum(10, 20);
		cc.multiply(10, 20);
		cc.divide(10, 10);
//		
//		#####Calling Parent and child class method with child class object and reference############
//		Result of Addition is :30
//		Result of Subtraction is :-10
//		Result of Multiplication is :200
//		Result of division is :1
//		

		System.out.println(
				"#####Calling overloaded method with parent reference. It will call only child method############");
		cc.parentmethod(); // will access child class method
//      Parent method overloaded

		System.out.println(
				"#####Calling parent class method with object reference of child################################");
		ClassParent cp2 = new ClassChild();
		cp2.addNum(10, 20);
		cp2.subNum(10, 20);
		cp2.multiply(10, 20);

//		#####Calling parent class method with object reference of child################################
//		Result of Addition is :30
//		Result of Subtraction is :-10
//		Result of Multiplication is :200

		System.out.println(
				"#####Calling parent class method with object reference of child################################");
		// ClassChild ccx = new ClassParent(); // Not Possible. Can not convert from
		// ClassParent to ClassChild

		ClassChild cc2 = (ClassChild) cp2; // Possible. Example of downcasting

		cc2.addNum(10, 20);
		cc2.subNum(10, 20);
		cc2.multiply(10, 20);
		cc2.divide(10, 20);

//        #####Calling parent class method with object reference of child################################
//        Result of Addition is :30
//        Result of Subtraction is :-10
//        Result of Multiplication is :200
//        Result of division is :0

	}
}