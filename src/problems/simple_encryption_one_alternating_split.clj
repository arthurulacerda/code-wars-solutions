; https://www.codewars.com/kata/57814d79a56c88e3e0000786
; Simple Encryption #1 - Alternating Split

(ns problems.simple-encryption-one-alternating-split)

(defn encrypt [st n]
  (if (> n 0)  
    (recur (str
             (apply str (take-nth 2 (rest st)))
             (apply str (take-nth 2 st)))
           (dec n))
    st))

(defn decrypt [st n] st)
