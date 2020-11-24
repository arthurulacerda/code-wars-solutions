(ns problems.bouncing-balls)

(defn valid-variables?
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
  (if (valid-variables? h bounce window)
    (count-bouncing h bounce window)
    -1))
