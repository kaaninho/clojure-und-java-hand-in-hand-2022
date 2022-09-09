(defproject cljservice "0.1.0-SNAPSHOT"
  :description "A minimal service example"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-jetty-adapter "1.8.2"]
                 [ring/ring-devel "1.6.3"]]
  :main cljservice.core/-main
  :repl-options {:init-ns cljservice.core})
