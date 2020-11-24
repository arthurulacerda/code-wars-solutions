(ns problems.bouncing-balls-test
  (:require [clojure.test :refer :all]
            [problems.bouncing-balls :refer [bouncing-balls]]))

; Float parameter "h" in meters must be greater than 0
; Float parameter "bounce" must be greater than 0 and less than 1
; Float parameter "window" must be less than h.
; If all three conditions above are fulfilled, return a positive integer, otherwise return -1.

(deftest success-examples
  (are [h  bounce window answer] (= (bouncing-balls h bounce window) answer)
        3  0.66   1.5    3
        30 0.66   1.5    15
        10 0.1    9      1))

(deftest fail-examples
  (testing "Bounce is 1 or greater"
    (is (= (bouncing-balls 3 1 1.5) -1))
    (is (= (bouncing-balls 3 2 1.5) -1)))

  (testing "Bounce is 0 or lower"
    (is (= (bouncing-balls 3  0 1.5) -1))
    (is (= (bouncing-balls 3 -1 1.5) -1)))

  (testing "Height is 0 or lower"
    (is (= (bouncing-balls  0 0.5 1.5) -1))
    (is (= (bouncing-balls -3 0.5 1.5) -1)))

  (testing "Window is equal or greater than Height"
    (is (= (bouncing-balls 10 0.66 10) -1))
    (is (= (bouncing-balls 10 0.66 11) -1))))
