; https://www.codewars.com/kata/55e2adece53b4cdcb900006c
; Tortoise racing

(ns problems.tortoise-racing)

(defn valid?
  [v1 v2 distance]
  (and (> v2 v1)
       (> v1 0)
       (> distance 0)))

(defn remainder [t]
  (* 60 (mod t 1)))

(defn race
  [v1 v2 distance]
  (if (valid? v1 v2 distance)
    (let [hour   (float (/ distance (- v2 v1)))
          minute (remainder hour)
          second (remainder minute)]
      (map int [hour minute second]))
    nil))
