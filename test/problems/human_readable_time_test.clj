(ns problems.human-readable-time-test
  (:require [clojure.test :refer :all]
            [problems.human-readable-time :refer [human-readable]]))

(deftest Tests
  (is (= (human-readable      0) "00:00:00"))
  (is (= (human-readable     59) "00:00:59"))
  (is (= (human-readable     60) "00:01:00"))
  (is (= (human-readable     90) "00:01:30"))
  (is (= (human-readable  86399) "23:59:59"))
  (is (= (human-readable 359999) "99:59:59"))
  (is (= (human-readable 360000) nil)))
