; https://www.codewars.com/kata/5a04133e32b8b998dc000089
; Dominant array elements

(ns problems.dominant-array-elements)

(defn solve
  ([numbers] (solve (seq numbers) '()))
  ([numbers result]
   (if (seq numbers)
     (if (seq result)
       (if (>= (first numbers) (first result))
         (solve numbers (rest result))
         (solve (rest numbers) (cons (first numbers) result)))
       (solve (rest numbers) [(first numbers)]))
     (vec (reverse result)))))
