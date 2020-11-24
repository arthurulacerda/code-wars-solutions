; https://www.codewars.com/kata/54da5a58ea159efa38000836
; Find the odd int

(ns problems.find-the-odd-int)

(def finc (fnil inc 0))

(defn assoc-inc
  [map key]
  (assoc map key (finc (get map key))))

(defn find-odd
  [xs]
  (->> xs
       (reduce assoc-inc {})
       (filter #(odd? (last %)))
       first
       first))
