; https://www.codewars.com/kata/529bf0e9bdf7657179000008/train/clojure
; Sudoku Solution Validator

(ns problems.sudoku-solution-validator)

(defn check-arr
  [arr]
  (and (= 9 (count arr))
       (= (set arr) (set (range 1 10)))))

(defn check-rows 
  [board]
  (every? true? (map check-arr board)))

(defn check-columns
  [board]
  (let [t-board (reduce (fn [t-board idx]
                           (conj t-board (map #(nth % idx) board)))
                         [] 
                         (range 0 9))]
    (check-rows t-board)))

(defn check-squares
  [board]
  (let [s-board (mapcat (fn [group]
                           (map (fn [idx]
                                  (reduce concat 
                                          [] 
                                          (partition 3 9 (drop (* idx 3) group))))
                                (range 0 3)))
                         (partition 27 (flatten board)))]
    (check-rows s-board)))

(defn valid-solution
  [board]
  (and (check-rows board)
       (check-columns board)
       (check-squares board)))
