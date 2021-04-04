; Simple Pig Latin
; https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/clojure

(ns problems.simple-pig-latin
  (:require [clojure.string :as s]))

(defn pig-it
  [w]
  (s/join " "
          (map (fn [substr]
                 (if (every? #(Character/isLetter %) substr)
                   (str (subs substr 1) (subs substr 0 1) "ay")
                   substr))
               (s/split w #"\s"))))
