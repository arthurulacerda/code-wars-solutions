; https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/clojure
; Human Readable Time

(ns problems.human-readable-duration-format)

(defn build-human-readable
  [arr s]
  (if (empty? arr)
    s
    (let [curr (first arr)
          num  (last curr)
          word (first curr)
          word (if (> num 1) 
                 (format "%ss" word) 
                 word)
          
          num-word (format "%s %s" (str num) word)

          num-word (if (empty? s)
                     num-word
                     (if (empty? (next arr))
                       (format " and %s" num-word)
                       (format ", %s" num-word)))]
      (build-human-readable (next arr) 
                            (format "%s%s" s num-word)))))
               
  

(defn formatDuration
  [secs]
  (let [s   (rem secs 60)
        m   (rem (quot secs 60) 60)
        h   (rem (quot secs 3600) 24)
        d   (rem (quot secs 86400) 365)
        y   (quot secs 31536000)
        arr (filter #(> (last %) 0) [["year"   y]
                                     ["day"    d]
                                     ["hour"   h]
                                     ["minute" m]
                                     ["second" s]])]
    (if (empty? arr)
      "now"
      (build-human-readable arr ""))))
