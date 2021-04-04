(ns problems.simple-pig-latin-test
  (:require [clojure.test :refer [deftest is]]
            [problems.simple-pig-latin :refer [pig-it]]))

(deftest pig-latin-example-test
  (is (= (pig-it "Pig latin is cool") "igPay atinlay siay oolcay")))

(deftest pig-latin-example-test-2
  (is (= (pig-it "This is my string") "hisTay siay ymay tringsay")))
