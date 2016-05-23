;; wagnersq's solution to Intro to Vectors conj function
;; https://4clojure.com/problem/7

(def answer (vector 1 2 3 4))

(= answer (conj [1 2 3] 4))

(= answer (conj [1 2] 3 4))
