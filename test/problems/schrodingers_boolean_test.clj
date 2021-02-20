(ns problems.schrodingers-boolean-test
  (:require [clojure.test :refer :all]
            [problems.schrodingers-boolean :refer [omnibool =]]))

(deftest basic-tests
  (is (= omnibool true))
  (is (= omnibool false)))
