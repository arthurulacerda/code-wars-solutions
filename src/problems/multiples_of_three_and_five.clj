; https://www.codewars.com/kata/514b92a657cdc65150000006/train/clojure
; Multiples of 3 or 5

(ns problems.multiples-of-three-and-five
  (:require [clojure.set :as sets]))

(defn solution
  [number]
  (let [m3 (set (range 0 number 3))
        m5 (set (range 0 number 5))]
    (reduce + (sets/union m3 m5))))
