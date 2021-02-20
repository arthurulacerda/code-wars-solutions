(ns problems.schrodingers-boolean-test
  (:require [clojure.test :refer :all]
            [problems.schrodingers-boolean :refer :all]))

(deftest basic-tests
  (is (= omnibool true))
  (is (= omnibool false)))
