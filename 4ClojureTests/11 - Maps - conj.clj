;; wagnersq's solution to Intro to Maps conj function
;; https://4clojure.com/problem/11

(def answer [:b 2])

(= {:a 1, :b 2, :c 3} (conj {:a 1} answer [:c 3]))
