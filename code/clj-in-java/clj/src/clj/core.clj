(ns clj.core
  (:gen-class
   :name clj.stuff
   :methods [#^{:static true} [transform [String] String]]))




(defn transform-string
  [string]
  (str (clojure.string/upper-case string)
       " from Clojure!"))






;; `transform-string` Java-konform und bekannt machen
(def -transform transform-string)
