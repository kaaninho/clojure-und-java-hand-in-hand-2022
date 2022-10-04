import clj.analyze;

public class Main {

    public static void main(String[] args) {

        String text = "JAVAFORUMNORD: Clojure at the JavaForumNord, CLOJURE is a functional language.";
        
        String analyzedText = clj.analyze.analyzeString(text).toString();

        System.out.println("\n\nThe most common word is: \n");

        System.out.println(analyzedText);
    }
}
