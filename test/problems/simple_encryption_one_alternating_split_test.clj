(ns problems.simple-encryption-one-alternating-split-test
  (:require [clojure.test :refer :all]
            [problems.simple-encryption-one-alternating-split :refer [encrypt decrypt]]))

(deftest sample-tests-encrypt
  (testing "Encription tests"
    (is (= "This is a test!" (encrypt "This is a test!" 0)))
    (is (= "hsi  etTi sats!" (encrypt "This is a test!" 1)))
    (is (= "s eT ashi tist!" (encrypt "This is a test!" 2)))
    (is (= " Tah itse sits!" (encrypt "This is a test!" 3)))
    (is (= "This is a test!" (encrypt "This is a test!" 4)))
    (is (= "This is a test!" (encrypt "This is a test!" -1)))
    (is (= "hskt svr neetn!Ti aai eyitrsig"
           (encrypt "This kata is very interesting!" 1)))))

(deftest sample-tests-decrypt
  (testing "Decryption tests"
    (is (= "This is a test!" (decrypt "This is a test!" 0)))
    (is (= "This is a test!" (decrypt "hsi  etTi sats!" 1)))
    (is (= "This is a test!" (decrypt "s eT ashi tist!" 2)))
    (is (= "This is a test!" (decrypt " Tah itse sits!" 3)))
    (is (= "This is a test!" (decrypt "This is a test!" 4)))
    (is (= "This is a test!" (decrypt "This is a test!" -1)))
    (is (= "This kata is very interesting!"
           (decrypt "hskt svr neetn!Ti aai eyitrsig" 1)))))
