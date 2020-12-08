; https://www.codewars.com/kata/55be10de92aad5ef28000023
; Color Choice

(ns problems.color-choice)

(defn factorial
  [n]
  (reduce *' (range 1 (inc n))))

(defn calc-m
  [fat-n fat-1st fat-2nd]
  (/ fat-n (*' fat-1st fat-2nd)))

(defn checkchoose
  ([m n]
   (let [fat-n   (factorial n)
         fat-1st 1
         fat-2nd (/ fat-n n)
         x       1]
     (checkchoose m n x fat-n fat-1st fat-2nd)))
  ([m n x fat-n fat-1st fat-2nd]
   (if (> x (int (/ n 2)))
     -1
     (if (not= m (calc-m fat-n fat-1st fat-2nd))
       (let [x*       (inc x)
             fat-1st* (*' fat-1st x*)
             fat-2nd* (/  fat-2nd (- n x))]
         (checkchoose m n x* fat-n fat-1st* fat-2nd*))
       x))))
