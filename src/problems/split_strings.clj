; https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/clojure
; Split Strings

(ns problems.split-strings
  (:require [clojure.string :as s]))

(defn split-in
  [word slice]
  (if (or (empty? word) (<= slice 0))
    []
    (if (<= slice (count word))
      (cons (subs word 0 slice)
            (split-in (subs word slice) slice)) 
      (cons (format "%s%s"
                    word
                    (s/join (repeat (- slice (count word)) 
                                    "_")))
            '()))))

(defn split
  ([word]
   (split word 2))
  ([word slice]
   (split-in word slice)))

(defn split-v2
  [s]
  (map s/join (partition 2 2 "_" s)))
