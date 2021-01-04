(ns problems.array-diff-test
  (:require [clojure.test :refer :all]
            [problems.array-diff :refer [array-diff]]))

(deftest empty-examples
  (testing "First array is empty"
    (is (= (array-diff [] 
                       [1 2 3])
           []))
    (is (= (array-diff [] 
                       [])
           [])))
  (testing "Both arrays are equal"
    (is (= (array-diff [1 2 3 4 5] 
                       [1 2 3 4 5])
           [])))
  (testing "Last array has all elements of the first array"
    (is (= (array-diff [1 2 3 4 5] 
                       [5 4 3 2 1])
           []))
    (is (= (array-diff [1 2 2 3 3 3]
                       [2 1 3])
           []))))

(deftest identity-examples
  (testing "Last array is empty"
    (is (= (array-diff [1 2 3]
                       [])
           [1 2 3]))
    (is (= (array-diff []
                       [])
           [])))
  (testing "Last array has no elements from first array"
    (is (= (array-diff [1 2 3 4 5]
                       [6 7 8 9 10])
           [1 2 3 4 5]))))

(deftest other-examples
  (is (= (array-diff [1 2 2 3]
                     [1 3])
         [2 2]))
  (is (= (array-diff [1 2 2 3]
                     [2])
         [1 3]))
  (is (= (array-diff [1 2 3 4]
                     ["1" "2" "3" "4"])
         [1 2 3 4]))
  (is (= (array-diff [0 4 8 5 6 0 4 8 9]
                     [3 8 5])
         [0 4 6 0 4 9])))
