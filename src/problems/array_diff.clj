; Array.diff
; https://www.codewars.com/kata/523f5d21c841566fde000009

(ns problems.array-diff)

(defn array-diff
  [a b]
  (vec (filter (fn [element]
                 (not (some #(= element %) b)))
               a)))
