import clj.analyze;

public class Main {

    public static void main(String[] args) {

        String text = "Karlsruher Entwicklertag: Clojure at Karlsruher Entwicklertag, CLOJURE is a functional language. Clojure is also a Lisp.";
        
        String analyzedText = clj.analyze.analyzeString(text).toString();

        System.out.println("\n\nThe 5 most common words are: \n");

        System.out.println(analyzedText);
    }
}
