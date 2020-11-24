(ns problems.tortoise-racing-test
  (:require [clojure.test :refer :all]
            [problems.tortoise-racing :refer [race]]))

(deftest success-examples
  (are [ v1  v2 distance    answer] (= (race v1 v2 distance) answer)
        720 850       70 [0 32 18]
         80  91       37 [3 21 49]))

(deftest fail-examples
  (testing "Tortoise 1 is faster than tortoise 2"
    (is (= (race 800 700 100) nil)))

  (testing "Tortoise 1 is the same speed as tortoise 2"
    (is (= (race 500 500 100) nil)))

  (testing "Tortoise 1 speed is zero or negative"
    (is (= (race    0  100 100) nil))
    (is (= (race -100  -50 100) nil)))
  
  (testing "Lead is equal or lesser than zero"
    (is (= (race 500 700    0) nil))
    (is (= (race 500 700 -100) nil))))
