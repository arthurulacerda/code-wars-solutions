(ns problems.multiples-of-three-and-five-test
  (:require [clojure.test :refer :all]
            [problems.multiples-of-three-and-five :refer [solution]]))

(deftest test-multiples-of-three-and-five
  (is (= 23 (solution 10))))
