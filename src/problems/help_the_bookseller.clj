; https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/clojure
; Help the bookseller !

(ns problems.help-the-bookseller
  (:require [clojure.string :as s]))

(defn reducer
  [acc curr]
  (let [key (subs curr 0 1)]
    (if-let [acc-val  (some-> (get acc key))]
      (assoc acc key (+ acc-val
                        (Integer/parseInt
                          (last (s/split curr #"\s")))))
      acc)))

(defn stock-list
  [ur vr]
  (if (or (empty? ur) (empty? vr))
    []
    (let [category-map (into {} (map #(vec [% 0]) vr))
          category-map (reduce reducer category-map ur)]
      (seq category-map))))
  
