; https://www.codewars.com/kata/551f23362ff852e2ab000037/train/clojure
; Pyramid Slide Down

(ns problems.pyramid-slide-down)

(defn redefine-base
  [base up-base]
  (map-indexed (fn 
                 [idx val]
                 (+ val
                    (max (nth base idx)
                         (nth base (inc idx))))) 
               up-base))

(defn longest-slide-down
  [pyramid]
  (if (= (count pyramid) 1)
    (ffirst pyramid)
    (let [base         (last pyramid)
          up-base      (last (drop-last pyramid))
          pyramid-chop (vec (drop-last 2 pyramid))
          new-base     (redefine-base base up-base)]
      (longest-slide-down (conj pyramid-chop new-base)))))
