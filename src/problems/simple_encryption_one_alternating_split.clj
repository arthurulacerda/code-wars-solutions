; https://www.codewars.com/kata/57814d79a56c88e3e0000786
; Simple Encryption #1 - Alternating Split

(ns problems.simple-encryption-one-alternating-split)

(defn encrypt
  [st n]
  (if (> n 0)  
    (recur (str
             (apply str (take-nth 2 (rest st)))
             (apply str (take-nth 2 st)))
           (dec n))
    st))

(defn decrypt
  [st n]
  (if (> n 0)
    (let [mid-index  (int (/ (count st) 2))
          first-half (subs st 0 mid-index)
          last-half  (subs st mid-index)]
      (recur (reduce str
                     (map #(str %2 %1)
                          (concat first-half (repeat nil))
                          last-half))
             (dec n)))
    st))
