(ns calljava.core
  (:gen-class)
  (:import

   ;; java.util.Date.
   ;; dann
   Point))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


;;; Zuerst: Java-interne Libraries

;; vollqualifiziert
(java.util.Date.)

;; mit `import`
#_(Date.)

;;; Dann eigene Java Libraries

(Point/silly 5)

(def thePoint (Point. 1 2))

(.-x thePoint)

(.distanceToPoint thePoint (Point. 0 0))

(defn distance-to-origin [point]
  (.distanceToPoint point (Point. 0 0)))

(distance-to-origin (Point. 3 4))
