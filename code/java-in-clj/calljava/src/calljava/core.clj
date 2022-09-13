(ns calljava.core
  (:gen-class)
  (:import

   java.util.Date
   ;; dann
   Point))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;;; 1. Java-interne Libraries

(java.util.Date.)

Date.toString

(.toString (new java.util.Date))


(def p (Point. 3 4))

(.-x p)

(.-y p)


(.distanceToPoint p (Point. 0 0))


- special syntax für interop


- wenn ihr jetzt das gefühl habt, dass da noch viel fehlt, dass es so einfach nicht sein kann,
  dann kann ich euch beruhigen: das war schon alles, damit hat man alles in der hand, um interop zu machen
- interfaces fehlen noch, ist auch kein problem






















;; vollqualifiziert

;; mit `import`
#_(Date.)

;;; Dann eigene Java Libraries

(Point/silly 5)

(def thePoint (Point. 1 2))

(.-x thePoint)

(.distanceToPoint thePoint (Point. 0 0))

(defn make-point [x y]
  (Point. x y))

(make-point 3 4)

(defn distance-to-origin [point]
  (.distanceToPoint point (Point. 0 0)))

(distance-to-origin (Point. 3 4))
