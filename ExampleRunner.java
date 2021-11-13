
class ExampleRunner{

    // this method calls and runs java code
    public static void main(String[] args) 
    { 
        // normal print statement
        System.out.println("This is the running part of the program"); 

        // create an object(instance of a class)
        Java_Example example = new Java_Example();

        // run object methods
        System.out.println(example.getValue());
        example.print("this is a test");
        example.setValue(3);

        int number = 100;
        number = example.getValue();
        System.out.println("your number is: " + number);

    } // end main method

}// end of class
