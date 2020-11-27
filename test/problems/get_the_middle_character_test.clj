(ns problems.get-the-middle-character-test
  (:require [clojure.test :refer :all]
            [problems.get-the-middle-character :refer [get-middle]]))

; Float parameter "h" in meters must be greater than 0
; Float parameter "bounce" must be greater than 0 and less than 1
; Float parameter "window" must be less than h.
; If all three conditions above are fulfilled, return a positive integer, otherwise return -1.

(deftest get-middle-test
  (are [word answer] (= (get-middle word) answer)
    "test"    "es"
    "testing" "t"
    "middle"  "dd"
    "A"       "A"))
 
