; https://www.codewars.com/kata/56747fd5cb988479af000028
; Get the Middle Character

(ns problems.get-the-middle-character)

(defn get-middle
  [word]
  (let [size (count word)]
    (if (even? size)
      (subs word (dec (/ size 2)) (inc (/ size 2)))
      (subs word (/ (dec size) 2) (inc (/ (dec size) 2))))))
