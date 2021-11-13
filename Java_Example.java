public class Java_Example{

	// feild values to hold class data
	private int value;

	// constructors to create class with
	Java_Example(){
		value = 0;
	}

	Java_Example(int num){
		value = num;
	}

	public void print(String word){
		System.out.println(word);
	}

	// getter and setter to get and change private feild values
	public int getValue(){
		return value;
	}

	public void setValue(int num){
		value = num;
	}


} // end of class
