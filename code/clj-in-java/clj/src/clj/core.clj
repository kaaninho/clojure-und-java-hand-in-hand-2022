(ns clj.core
  (:gen-class
   :name clj.analyze
   :methods [#^{:static true} [analyzeString [String] java.util.HashMap]])
  
  (:require [clojure.string :as s]))



(defn words [string]
  (re-seq #"[\w|´]+" string))






;;; Die häufigsten 5 Wörter







































(def common-words
  #{"and" "of" "the" "a" "i" "was" "in" "his" "had" "with" "glad" "them"
    "on" "am" "their" "you" "that" "´" "it" "is" "there" "my" "son" "so"
    "he" "not" "than" "have" "said" "but" "passed" "has" "at" "your" "as"})











































;; `analyze-string` Java-konform und bekannt machen
;; (def -analyzeString analyze-string)















;;; ==== SOLUTION ====

(def book (slurp "book.txt"))

(count book)

(defn words [string]
  (re-seq #"[\w|´]+" string))

(count (words book))

(frequencies (words book))


;;; Durchgang:
;;  !!!Starte mit 6. Zeile!!!
;;; Vorgehensweise:
;; - slurp und count
;; - words und frequencies
;; - lower-case, hier bemerken, dass es unübersichtlich wird
;; - umschreiben auf ->>, dann merken, dass common-words benötigt wird
;; - remove zeigen
;; - menge als funktion zeigen
;; - sort und dann sort-by mit val
;; - take-last
;; - reverse
;; Dann zu einer Funktion basteln
;; - Docstring
;; - into {} und java.util.HashMap. damit wir es exportieren können
;; - analyze-string Java-konform und bekannt machen (s. o., Typangaben)
;; in Terminal java-Aufruf zeigen

(def common-words
  #{"and" "of" "the" "a" "i" "was" "in" "his" "had" "with" "glad" "them"
    "on" "am" "their" "you" "that" "´" "it" "is" "there" "my" "son" "so"
    "he" "not" "than" "have" "said" "but" "passed" "has" "at" "your" "as"})

(defn analyze-string
  "Analyzes a given string.

  Returns the 5 most used words with their count of appearance as a map."
  [string]
  (->> string
       (words)
       (map s/lower-case)
       (remove common-words)
       (frequencies)
       (sort-by val)
       (take-last 5)
       (reverse)
       (into {})
       (java.util.HashMap.)))

;; `analyze-string` Java-konform und bekannt machen
(def -analyzeString analyze-string)






(def book-string
  "So it was that in the light of a fair morning King The´oden and
Gandalf the White Rider met again upon the green grass beside the
Deeping-stream. There was also Aragorn son of Arathorn, and
Legolas the Elf, and Erkenbrand of Westfold, and the lords of the
Golden House. About them were gathered the Rohirrim, the Riders
of the Mark: wonder overcame their joy in victory, and their eyes
were turned towards the wood.
Suddenly there was a great shout, and down from the Dike came
those who had been driven back into the Deep. There came Gamling
the Old, and Eomer son of Eomund, and beside them walked Gimli ´ ´
the dwarf. He had no helm, and about his head was a linen band
stained with blood; but his voice was loud and strong.
‘Forty-two, Master Legolas!’ he cried. ‘Alas! My axe is notched:
the forty-second had an iron collar on his neck. How is it with you?’
‘You have passed my score by one,’ answered Legolas. ‘But I do
not grudge you the game, so glad am I to see you on your legs!’ ´ 
‘Welcome, Eomer, sister-son!’ said The´oden. ‘Now that I see you
safe, I am glad indeed.’

‘Hail, Lord of the Mark!’ said Eomer. ‘The dark night has passed, ´
and day has come again. But the day has brought strange tidings.’
He turned and gazed in wonder, first at the wood and then at Gandalf.
‘Once more you come in the hour of need, unlooked-for,’ he said.
‘Unlooked-for?’ said Gandalf. ‘I said that I would return and meet
you here.’
‘But you did not name the hour, nor foretell the manner of your
coming. Strange help you bring. You are mighty in wizardry, Gandalf
the White!’
‘That may be. But if so, I have not shown it yet. I have but given
good counsel in peril, and made use of the speed of Shadowfax. Your
own valour has done more, and the stout legs of the Westfold-men
marching through the night.’
Then they all gazed at Gandalf with still greater wonder. Some
glanced darkly at the wood, and passed their hands over their brows,
as if they thought their eyes saw otherwise than his.
Gandalf laughed long and merrily. ‘The trees?’ he said. ‘Nay, I
see the wood as plainly as do you. But that is no deed of mine. It is
a thing beyond the counsel of the wise. Better than my design, and
better even than my hope the event has proved.")




;; Java Aufruf
;; java -cp ".:clj/target/uberjar/clj-0.1.0-SNAPSHOT-standalone.jar" Main.java
