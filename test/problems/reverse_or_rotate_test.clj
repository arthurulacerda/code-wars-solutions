(ns problems.reverse-or-rotate-test
  (:require [clojure.test :refer :all]
            [problems.reverse-or-rotate :refer [revrot]]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (is (= (revrot "123456987654" 6)       "234561876549"))
  (is (= (revrot "123456987653" 6)       "234561356789"))
  (is (= (revrot "66443875" 4)           "44668753"))
  (is (= (revrot "66443875" 8)           "64438756"))
  (is (= (revrot "664438769" 8)          "67834466"))
  (is (= (revrot "123456779" 8)          "23456771"))
  (is (= (revrot "" 8)                   ""))
  (is (= (revrot "123456779" 0)          ""))
  (is (= (revrot "563000655734469485" 4) "0365065073456944"))
  (is (= (revrot "1234" 0)               ""))
  (is (= (revrot "" 0)                   ""))
  (is (= (revrot "1234" 5)               ""))
  (is (= (revrot "733049910872815764" 5) "330479108928157")))
