import clj.analyze;

public class Main {

    public static void main(String[] args) {

        String text = "JAVAFORUMNORD: We are at JavaForumNord, how is it at the Javaforumnord so far?";
        
        String analyzedText = clj.analyze.analyzeString(text);

        System.out.println("\n\nThe most common word is: \n");

        System.out.println(analyzedText);
    }
}
