;; wagnersq's solution to Sequences map
;; https://4clojure.com/problem/17

(def answer '(6 7 8))

(= answer (map #(+ % 5) '(1 2 3)))
