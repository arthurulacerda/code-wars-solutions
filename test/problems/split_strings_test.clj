(ns problems.split-strings-test
  (:require [clojure.test :refer :all]
            [problems.split-strings :refer [split
                                            split-in
                                            split-v2]]))

(deftest tests-split
  (is (= (split "")       []))
  (is (= (split "a")      ["a_"]))
  (is (= (split "ab")     ["ab"]))
  (is (= (split "abc")    ["ab" "c_"]))
  (is (= (split "abcd")   ["ab" "cd"]))
  (is (= (split "abcde")  ["ab" "cd" "e_"]))
  (is (= (split "abcdef") ["ab" "cd" "ef"])))

(deftest tests-split-in
  (testing "split-in negative"
    (is (= (split-in ""       -1) []))
    (is (= (split-in "a"      -1) []))
    (is (= (split-in "ab"     -1) []))
    (is (= (split-in "abc"    -1) []))
    (is (= (split-in "abcd"   -1) []))
    (is (= (split-in "abcde"  -1) []))
    (is (= (split-in "abcdef" -1) [])))
  (testing "split-in zero"
    (is (= (split-in ""        0) []))
    (is (= (split-in "a"       0) []))
    (is (= (split-in "ab"      0) []))
    (is (= (split-in "abc"     0) []))
    (is (= (split-in "abcd"    0) []))
    (is (= (split-in "abcde"   0) []))
    (is (= (split-in "abcdef"  0) [])))
  (testing "split-in one"
    (is (= (split-in ""        1) []))
    (is (= (split-in "a"       1) ["a"]))
    (is (= (split-in "ab"      1) ["a" "b"]))
    (is (= (split-in "abc"     1) ["a" "b" "c"]))
    (is (= (split-in "abcd"    1) ["a" "b" "c" "d"]))
    (is (= (split-in "abcde"   1) ["a" "b" "c" "d" "e"]))
    (is (= (split-in "abcdef"  1) ["a" "b" "c" "d" "e" "f"])))
  (testing "split-in two"
    (is (= (split-in ""        2) []))
    (is (= (split-in "a"       2) ["a_"]))
    (is (= (split-in "ab"      2) ["ab"]))
    (is (= (split-in "abc"     2) ["ab" "c_"]))
    (is (= (split-in "abcd"    2) ["ab" "cd"]))
    (is (= (split-in "abcde"   2) ["ab" "cd" "e_"]))
    (is (= (split-in "abcdef"  2) ["ab" "cd" "ef"])))
  (testing "split-in five"
    (is (= (split-in ""        5) []))
    (is (= (split-in "a"       5) ["a____"]))
    (is (= (split-in "ab"      5) ["ab___"]))
    (is (= (split-in "abc"     5) ["abc__"]))
    (is (= (split-in "abcd"    5) ["abcd_"]))
    (is (= (split-in "abcde"   5) ["abcde"]))
    (is (= (split-in "abcdef"  5) ["abcde" "f____"]))))

(deftest tests-split-v2
  (is (= (split-v2 "")       []))
  (is (= (split-v2 "a")      ["a_"]))
  (is (= (split-v2 "ab")     ["ab"]))
  (is (= (split-v2 "abc")    ["ab" "c_"]))
  (is (= (split-v2 "abcd")   ["ab" "cd"]))
  (is (= (split-v2 "abcde")  ["ab" "cd" "e_"]))
  (is (= (split-v2 "abcdef") ["ab" "cd" "ef"])))
