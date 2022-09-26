(ns calljava.core-test
  (:require [clojure.test :refer :all]
            [calljava.core :refer :all]))

(deftest long-names-test
  (is (= ["my-long-name"]
         (long-names #{"kaan" "my-long-name"}))))
