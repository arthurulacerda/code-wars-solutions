(ns problems.two-to-one-test
  (:require [clojure.test :refer :all]
            [problems.two-to-one :refer [longest]]))

(deftest examples
  (is (= (longest "a" "b") "ab"))
  
  (is (= (longest "b" "a") "ab"))

  (is (= (longest "" "") ""))

  (is (= (longest "a" "") "a"))
  
  (is (= (longest "" "a") "a"))
  
  (is (= (longest
           "aretheyhere"
           "yestheyarehere")
         "aehrsty"))

  (is (= (longest
           "loopingisfunbutdangerous"
           "lessdangerousthancoding")
         "abcdefghilnoprstu"))
  
  (is (= (longest
           "inmanylanguages"
           "theresapairoffunctions")
         "acefghilmnoprstuy"))
  
  (is (= (longest
           "ababababababababbabababababababababbababa"
           "bbbbbbbbbaaaaaaaaaaaabbbbbbbbbbbaaaaaaaaa")
         "ab")))


