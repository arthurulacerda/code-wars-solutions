(ns problems.dominant-array-elements-test
  (:require [clojure.test :refer :all]
            [problems.dominant-array-elements :refer [solve]]))

(deftest basic-tests
  (is (= (solve [16,17,14,3,14,5,2]) [17,14,5,2]))
  (is (= (solve [92,52,93,31,89,87,77,105]) [105]))
  (is (= (solve [75,47,42,56,13,55]) [75,56,55]))
  (is (= (solve [67,54,27,85,66,88,31,24,49]) [88,49]))
  (is (= (solve [76,17,25,36,29]) [76,36,29]))
  (is (= (solve [104,18,37,9,36,47,28]) [104,47,28])))
