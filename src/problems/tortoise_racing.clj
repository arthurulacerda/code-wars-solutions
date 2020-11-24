; https://www.codewars.com/kata/55e2adece53b4cdcb900006c
; Tortoise racing

(ns problems.tortoise-racing)

(defn valid?
  [v1 v2 distance]
  (and (> v2 v1)
       (> v1 0)
       (> distance 0)))

(defn time-to-reach
  [v distance]
  (let [hours-seconds   (/ distance v)
        hours           (int (/ hours-seconds 3600))
        minutes-seconds (- hours-seconds (* hours 3600))
        minutes         (int (/ minutes-seconds 60))
        seconds         (int (- minutes-seconds (* minutes 60)))]
    [hours minutes seconds]))

(defn race
  [v1 v2 distance]
  (if (valid? v1 v2 distance)
    (time-to-reach (/ (- v2 v1) 3600) distance)
    nil))
