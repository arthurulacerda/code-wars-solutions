; https://www.codewars.com/kata/5bd776533a7e2720c40000e5
; The Poet And The Pendulum

(ns problems.the-poet-and-the-pendulum)

(defn pendulum 
  ([numbers]
   (vec (pendulum (reverse (sort numbers)) (even? (count numbers)))))
  ([numbers right?]
   (if-let [next-value   (first numbers)]
     (if right?
       (concat (pendulum (rest numbers) (not right?)) [next-value])
       (concat [next-value] (pendulum (rest numbers) (not right?))))
     [])))

(pendulum [4 10 9])


