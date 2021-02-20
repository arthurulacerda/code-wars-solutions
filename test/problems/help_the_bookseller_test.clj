(ns problems.help-the-bookseller-test
  (:require [clojure.test :refer :all]
            [problems.help-the-bookseller :refer [stock-list]]))

(deftest test-help-the-bookseller
  (testing "Test 1"
    (def ur ["BBAR 150" 
             "CDXE 515" 
             "BKWR 250" 
             "BTSQ 890" 
             "DRTY 600"])
    (def vr ["A" 
             "B" 
             "C" 
             "D"])
    (def res [["A"    0] 
              ["B" 1290] 
              ["C"  515] 
              ["D"  600]])
    (is (= (stock-list ur vr) res)))

  (testing "Test 2"
    (def ur ["XAAA 150"
             "XAAB 515"
             "XAAC 250"
             "XAAD 890"
             "XAAE 600"])
    (def vr ["A"
             "B"
             "C"
             "X"])
    (def res [["A"    0]
              ["B"    0]
              ["C"    0]
              ["X" 2405]])
    (is (= (stock-list ur vr) res)))

  (testing "Test 3"
    (def ur ["XAAA 150"
             "XAAB 515"
             "XAAC 250"
             "XAAD 890"
             "XAAE 600"])
    (def vr ["A"
             "B"
             "C"
             "D"])
    (def res [["A"    0]
              ["B"    0]
              ["C"    0]
              ["D"    0]])
    (is (= (stock-list ur vr) res)))
  
  (testing "Test 4"
    (def ur ["BBAR 150"
             "CDXE 515"
             "BKWR 250"
             "BTSQ 890"
             "DRTY 600"])
    (def vr [])
    (def res [])
    (is (= (stock-list ur vr) res)))
  
  (testing "Test 5"
    (def ur [])
    (def vr ["A"
             "B"
             "C"
             "D"])
    (def res [])
    (is (= (stock-list ur vr) res))))
