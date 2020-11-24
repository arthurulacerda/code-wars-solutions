; https://www.codewars.com/kata/5544c7a5cb454edb3c000047
; Bouncing Balls

(ns problems.bouncing-balls)

(defn valid?
  [h bounce window]
  (and (> h 0)
       (> h window)
       (> bounce 0)
       (< bounce 1)))

(defn count-bouncing
  ([h bounce window]
   (count-bouncing h bounce window -1))
  ([h bounce window count]
   (if (> h window)
     (count-bouncing (* h bounce) bounce window (+ 2 count))
     count)))

(defn bouncing-balls 
  [h bounce window]
  (if (valid? h bounce window)
    (count-bouncing h bounce window)
    -1))
