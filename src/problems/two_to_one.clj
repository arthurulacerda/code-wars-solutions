; https://www.codewars.com/kata/5656b6906de340bd1b0000ac
; Two to One

(ns problems.two-to-one
  (:require [clojure.string :as s]
            [clojure.set :as set]))

(defn longest
  [s1 s2]
  (s/join "" (sort (set/union
                     (set s1)
                     (set s2)))))
