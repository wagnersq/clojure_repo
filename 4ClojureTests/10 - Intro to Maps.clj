;; wagnersq's solution to Intro to Maps
;; https://4clojure.com/problem/10

(def answer 20)

(= answer ((hash-map :a 10, :b 20, :c 30) :b))

(= answer (:b {:a 10, :b 20, :c 30}))
