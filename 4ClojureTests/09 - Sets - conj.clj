;; wagnersq's solution to Intro to Sets conj function
;; https://4clojure.com/problem/9

(def answer 2)

(= #{1 2 3 4} (conj #{1 4 3} answer))
