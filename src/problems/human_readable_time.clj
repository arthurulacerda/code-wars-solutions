; https://www.codewars.com/kata/52685f7382004e774f0001f7/train/clojure
; Human Readable Time

(ns problems.human-readable-time)

(defn valid?
  [num]
  (< num 360000))

(defn convert-to-higher-scale
  [num]
  [(quot num 60) (rem num 60)])

(defn human-readable
  [num]  
  (if (valid? num)
    (let [[minute* second] (convert-to-higher-scale num)
          [hour minute]    (convert-to-higher-scale minute*)]
      (format "%02d:%02d:%02d" hour minute second))
    nil))
