; https://www.codewars.com/kata/5bd776533a7e2720c40000e5
; The Poet And The Pendulum

(ns problems.the-poet-and-the-pendulum)

(defn pendulum 
  [numbers]
  (let [sorted-numbers (sort numbers)
        first-half     (reverse (take-nth 2 sorted-numbers))
        last-half    (take-nth 2 (rest sorted-numbers))]
    (concat first-half last-half)))



