; https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991
; Reverse or rotate?

(ns problems.reverse-or-rotate
  (:require [clojure.string :as s]))

(defn valid?
  [strng sz]
  (and (> sz 0)
       (not-empty strng)
       (>= (count strng) sz)))

(defn sum-of-cubes
  [strng]
  (reduce + (map #(* % % %)
                 (map #(Integer/parseInt %) 
                      (s/split strng #"")))))

(defn rotate
  [strng]
  (str (apply str (rest strng)) (first strng)))

(defn revrot 
  [strng sz]
  (if (valid? strng sz)
    (let [substrng     (subs strng 0 sz)
          strng-revrot (if (even? (sum-of-cubes substrng))
                         (apply str (reverse substrng))
                         (rotate substrng))]
      (str strng-revrot
           (revrot (subs strng sz) sz)))
    ""))
