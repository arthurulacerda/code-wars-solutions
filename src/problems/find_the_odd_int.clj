; https://www.codewars.com/kata/54da5a58ea159efa38000836
; Find the odd int

(ns problems.find-the-odd-int)

(defn find-odd
  [xs]
  (->> xs
       frequencies
       (filter #(odd? (last %)))
       ffirst))
