(defproject clj "0.1.0-SNAPSHOT"
  :description "A minimal CLJ example"
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot clj.analyze
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
