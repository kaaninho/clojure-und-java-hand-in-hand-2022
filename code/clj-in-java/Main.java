import clj.stuff;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World from Java!");

        String[] theArgs = {"hello world","other","stuff"};

        clj.stuff.main(theArgs);

        String transformResult = clj.stuff.transform("called transform directly");
        System.out.println(transformResult);
    }
}
