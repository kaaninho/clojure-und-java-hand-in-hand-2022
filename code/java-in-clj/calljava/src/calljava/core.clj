(ns calljava.core)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))



;;; 1. REPL und Editor-Magic




;;; 2. Java-interne Libraries




;;; 3. eigene Libraries

























































;; (ns calljava.core
;;   (:import java.util.Date
;;            Point
;;            Distance))


;; ;;; 1. REPL und Editor-Magic

;; (+ 1 2)

;; (map inc [1 2 3 4])

;; (filter even? [1 2 3 4 5])

;; ;;; 2. Java-interne Libraries

;; (def the-date (java.util.Date.))

;; (.toString (java.util.Date.))

;; ;; dann importieren

;; (Date.)

;; (.toString the-date)

;; (str the-date)

;; ;;; 3. eigene Libraries

;; (def p (Point. 3 4))

;; (str p)

;; (.-y p)

;; (defn make-point [x y]
;;   (Point. x y))

;; (make-point 3 4)


;; (defn distance-to-origin [point]
;;   (.distanceToPoint point (Point. 0 0)))

;; (distance-to-origin p)

;;; Neuer Record

;; (defrecord Point3D [x y z])

;; Interfaces implementieren
;; (erst toString)

;; (defrecord Point3D [x y z]
;;   Object
;;   (toString [_] (str "X-Koord: " x ", Y-Koord: " y ", Z-Koord: " z))
;;   Distance
;;   (distanceToOrigin [_] (Math/sqrt (+ (* x x) (* y y) (* z z)))))
;;
;; (str (->Point3D 1 2 3))
;;
;; (.distanceToOrigin (->Point3D 0 3 4))
