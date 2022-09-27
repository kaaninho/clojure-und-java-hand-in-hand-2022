(ns calljava.core)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))



;;; 1. REPL und Editor-Magic




;;; 2. Java-interne Libraries




;;; 3. eigene Libraries








































;; vollqualifiziert

;; mit `import`
#_(Date.)

;;; Dann eigene Java Libraries

(def thePoint (Point. 1 2))

(.-x thePoint)

(.distanceToPoint thePoint (Point. 0 0))

(defn make-point [x y]
  (Point. x y))

(make-point 3 4)

(defn distance-to-origin [point]
  (.distanceToPoint point (Point. 0 0)))

(distance-to-origin (Point. 3 4))


;; Interfaces implementieren

(defrecord Point3D [x y z]
  Object
  (toString [_] (str "X-Koord: " x ", Y-Koord: " y "Z-Koord: " z)))

(str (->Point3D 1 2 3))


(defrecord Point3D [x y z]
  Distance
  (distanceToOrigin [this] 5.0))

(.distanceToOrigin (->Point3D 1 2 3))
