;; wagnersq's solution to Intro to Lists conj function
;; https://4clojure.com/problem/5

(def answer1 (list 1 2 3 4))

(= answer1 (conj '(2 3 4) 1))

(= answer1 (conj '(3 4) 2 1))


(def answer2 '(1 2 3 4))

(= answer2 (conj '(2 3 4) 1))

(= answer2 (conj '(3 4) 2 1))
